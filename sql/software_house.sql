CREATE TABLE `departemen`
( `kode` VARCHAR
(3) NOT NULL , `nama` VARCHAR
(45) UNIQUE NOT NULL , `nik_manajer` VARCHAR
(10) NULL , PRIMARY KEY
(`kode`));

CREATE TABLE `karyawan`
( `nik` VARCHAR
(10) NOT NULL , `nama` VARCHAR
(100) NOT NULL , `tanggal_lahir` DATE NULL, `jenis_kelamin` ENUM
('PRIA','WANITA') NULL , `alamat` VARCHAR
(255) NULL , `nomor_telepon` VARCHAR
(20) NOT NULL , `email` VARCHAR
(100) UNIQUE NOT NULL , `gaji` DECIMAL
(10,2) UNIQUE NULL , `departemen_kode` VARCHAR
(3) NOT NULL , PRIMARY KEY
(`nik`), FOREIGN KEY fk_karyawan_departemen_kode
(departemen_kode) REFERENCES departemen
(kode) ON
DELETE CASCADE ON
UPDATE CASCADE);

ALTER TABLE `departemen`
ADD FOREIGN KEY fk_departemen_karyawan_nik
(`nik_manajer`) REFERENCES `karyawan`
(`nik`) ON
DELETE CASCADE ON
UPDATE CASCADE;

CREATE TABLE `klien`
( `nomor` INT NOT NULL , `nama` VARCHAR
(100) NOT NULL , `alamat` VARCHAR
(255) NULL , `jenis` ENUM
('INDIVIDU','INSTANSI') NOT NULL , `nomor_telepon` VARCHAR
(20) UNIQUE NOT NULL , `email` VARCHAR
(100) UNIQUE NOT NULL , PRIMARY KEY
(`nomor`));

CREATE TABLE `proyek`
( `nomor` INT NOT NULL , `nomor_klien` INT NOT NULL , `nama` VARCHAR
(100) NOT NULL , `deskripsi` TEXT NULL , `tanggal_mulai` DATE NULL , `tanggal_selesai` DATE NULL , PRIMARY KEY
(`nomor`), FOREIGN KEY fk_proyek_klien_nomer
(nomor_klien) REFERENCES klien
(nomor) ON
DELETE CASCADE ON
UPDATE CASCADE);

CREATE TABLE `penugasan`
( `nomor_proyek` INT NOT NULL , `nik` VARCHAR
(10) NOT NULL , `total_jam` INT
(3) NULL , PRIMARY KEY
(`nomor_proyek`, `nik`), FOREIGN KEY fk_penugasan_proyek_nomer
(nomor_proyek) REFERENCES proyek
(nomor) ON
DELETE CASCADE ON
UPDATE CASCADE, FOREIGN KEY fk_penugasan_karyawan_nik (nik)
REFERENCES karyawan
(nik) ON
DELETE CASCADE ON
UPDATE CASCADE);

CREATE TABLE `departemen_backup`
( `kode` VARCHAR
(3) PRIMARY KEY , `nama` VARCHAR
(45), `nik_manajer` VARCHAR
(10));

INSERT INTO `departemen` (`
kode`,
`nama
`, `nik_manajer`) VALUES
('MKK', 'Manajemen dan Kontol Kualitas', NULL);

INSERT INTO `
departemen`
VALUES
    ('RND', 'Riset dan Pengembangan', NULL);

INSERT INTO `
departemen`
VALUES
    ('DUX', 'Desain dan User Experience', NULL),
    ('MKT', 'Marketing', NULL),
    ('CSR', 'Costumer Service and Relation', NULL);

INSERT INTO `departemen` (`
kode`,
`nama
`) VALUES
('PRD', 'Produksi'),
('HRD', 'Human Resource Development'),
('MGT', 'Top Level Management');

INSERT INTO departemen
SET kode
= 'PKU', nama = 'Pekerjaan Umum';

INSERT INTO departemen_backup
SELECT *
FROM departemen;
INSERT INTO karyawan
VALUES
    ('741104013', 'Ahmad Husain', '1988-07-12', 'PRIA', 'Jl. Ikan Tombro No. 8', '0858992878', 'a.husain88@gmail.com', 100000 , 'DUX'),
    ('741104019', 'Brian Anggriawan', '1987-12-09', 'PRIA', 'Jl. Bandung No. 2', '0857646577', 'brian.anggriawan@live.com', 89000 , 'PKU');

UPDATE `departemen`
SET
`nik_manajer` = '741104013';

UPDATE `departemen`
SET
`nik_manajer` = '741104019' WHERE `kode` = 'PKU';

UPDATE `departemen`
SET
`nik_manajer` = NULL WHERE `nik_manajer` = '741104013';

UPDATE `departemen`
SET
`nama` = 'Desain dan Pengalaman Pengguna',`nik_manajer` = '741104013' WHERE `kode` = 'DUX';

UPDATE `departemen`
SET
`nik_manajer` =
(SELECT nik
FROM karyawan
WHERE nama = 'Ahmad Husain')
WHERE `kode` = 'RND';

DELETE FROM `departemen` WHERE `nik_manajer` IS NOT NULL;