-- Praktikum 1
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

-- Praktikum 2
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

-- Praktikum 3
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

-- Praktikum 4
DELETE FROM `departemen` WHERE `nik_manajer` IS NOT NULL;

DELETE FROM departemen;

UPDATE departemen_backup SET nik_manajer = NULL WHERE kode = 'CSR';

-- Tugas 3
INSERT INTO departemen
SELECT *
FROM departemen_backup;

-- Tugas 4
INSERT INTO karyawan
VALUES
    ( '1841720010', 'Annisa Bahar', '1999-11-05', 'WANITA', 'Jl. Hayam Wuruk 30', '0812421448', 'a.bahar@gmail.com', '200000', 'CSR' ),
    ( '1841720011', 'Mustika Ratu', '1999-11-06', 'WANITA', 'Jl. Hayam Wuruk 50', '0812321490', 'm.ratu@gmail.com', '250000', 'CSR' ),
    ( '1841720012', 'Nico Robin', '1999-11-07', 'WANITA', 'Jl. Hayam Wuruk 40', '0812736137', 'n.robin@gmail.com', '2000000', 'CSR' ),
    ( '1841720013', 'Minami Hamabe', '1999-11-09', 'WANITA', 'Jl. Jepang 60', '0812446214', 'm.hamabe@gmail.com', '6000000', 'HRD' ),
    ( '1841720014', 'Saitama', '1999-11-10', 'PRIA', 'Jl. Jepang 80', '0812999999', 'saitama@gmail.com', '500000', 'HRD' ),
    ( '1841720016', 'Megan Fox', '1999-11-12', 'WANITA', 'Jl. Amerika 50', '0812312314', 'm.fox@gmail.com', '2100000', 'MGT' ),
    ( '1841720015', 'Yukinoshita', '1999-11-13', 'WANITA', 'Jl. Jepang 20', '0812391242', 'yukinon@gmail.com', '1500000', 'MKK' ),
    ( '1841720017', 'Mark Zuckerberg', '1999-11-11', 'PRIA', 'Jl. Amerika 90', '0812183913', 'm.zuck@gmail.com', '650000', 'MKT' ),
    ( '1841720018', 'Jack Ma', '1999-11-14', 'PRIA', 'Jl. China 1', '0812536123', 'j.mak@gmail.com', '600000', 'PRD' ),
    ( '1841720019', 'Sultan Achmad', '1999-11-08', 'PRIA', 'Rumdin BLKI Singosari 40', '087739491570', 'sultangendut@gmail.com', '5000000', 'RND' );

-- Tugas 5
UPDATE `departemen`
SET
`nik_manajer` = '1841720010' WHERE `kode` = 'CSR';
UPDATE `departemen`
SET
`nik_manajer` = '741104013' WHERE `kode` = 'DUX';
UPDATE `departemen`
SET
`nik_manajer` = '1841720013' WHERE `kode` = 'HRD';
UPDATE `departemen`
SET
`nik_manajer` = '1841720016' WHERE `kode` = 'MGT';
UPDATE `departemen`
SET
`nik_manajer` = '1841720015' WHERE `kode` = 'MKK';
UPDATE `departemen`
SET
`nik_manajer` = '1841720017' WHERE `kode` = 'MKT';
UPDATE `departemen`
SET
`nik_manajer` = '741104019' WHERE `kode` = 'PKU';
UPDATE `departemen`
SET
`nik_manajer` = '1841720018' WHERE `kode` = 'PRD';
UPDATE `departemen`
SET
`nik_manajer` = '1841720019' WHERE `kode` = 'RND';

-- Tugas 6
INSERT INTO klien
VALUES
    ('0319001', 'Suseno Wibowo', 'Jl. Tidar Atas 35', 'INDIVIDU', '082184172741', 'seno.wibowo@gmail.com'),
    ('0319002', 'Infomedia', 'Jl bangau 10', 'INSTANSI', '0341417291', 'support@infomedia.com'),
    ('0319003', 'Arif Prawiro', 'Jl. Danau Bratan 15', 'INDIVIDU', '08913747182', 'a.prawiro@gmail.com'),
    ('0319004', 'Ester Noviant', 'Jl. Bedali Agung 86', 'INDIVIDU', '087716646164', 'e.noviant@gmail.com'),
    ('0319005', 'BLKI SIngosari', 'Jl. Raya Singosari no.1', 'INSTANSI', '0341736125', 'blki_singosari@gmail.com');

INSERT INTO proyek
VALUES
    ('1', '319001', 'Travel App', 'membuat aplikasi pemesanan tiket travel', '2019-03-04', '2019-05-23'),
    ('2', '319002', 'Complaint App', 'membuat aplikasi untuk aduan pengguna kepada perusahaan', '2019-03-06', '2019-06-17'),
    ('3', '319003', 'Tracking Health', 'membuat aplikasi yang dapat menyimpan hasil kesehatan secara rutin dan menganalisanya', '2019-03-11', '2019-06-19'),
    ('4', '319004', 'Girl Online Shop', 'membuat aplikasi online shop untuk kebutuhan wanita', '2019-03-21', '2019-06-22'),
    ('5', '319005', 'Aplikasi Daftar Pelatihan', 'membuat aplikasi untuk pendaftaran pelatihan di BLKI Singosari', '2019-03-25', '2019-06-26');

INSERT INTO penugasan
VALUES
    ('1', '1841720012', '70'),
    ('1', '1841720014', '80'),
    ('1', '1841720010', '90'),
    ('2', '1841720016', '70'),
    ('2', '1841720011', '80'),
    ('2', '1841720013', '90'),
    ('3', '1841720015', '70'),
    ('3', '1841720016', '80'),
    ('3', '1841720017', '90'),
    ('4', '1841720018', '70'),
    ('4', '1841720019', '80'),
    ('4', '741104013', '90'),
    ('5', '741104019', '70'),
    ('5', '1841720014', '80'),
    ('5', '741104013', '90');

SELECT *
FROM klien;
SELECT *
FROM proyek;
SELECT *
FROM penugasan;

-- Tugas 7
DELETE FROM departemen_backup;
INSERT INTO departemen_backup
SELECT *
FROM departemen;
SELECT *
FROM departemen_backup;

-- Tugas 8
DELETE FROM departemen WHERE nama LIKE '%dan%';
