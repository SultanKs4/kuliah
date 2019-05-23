CREATE TABLE `ddlQuery`
( `nim` CHAR
(20) NOT NULL , `nama_ddl` CHAR
(50) NOT NULL , `umur` INT NOT NULL , PRIMARY KEY
(`nim`));

ALTER TABLE `ddlQuery`
ADD `newAlter` VARCHAR
(20) NOT NULL AFTER `nama_ddl`;

DROP TABLE `ddlQuery`;

INSERT INTO `
kelas`
VALUES
    ('MI-3B', 'Manajemen Informatika 4 B', 40);

UPDATE `kelas`
SET
`nama_kelas` = 'Manajemen Informatika 3 B', `jumlah_siswa` = '30' WHERE `kelas`.`kode_kelas` = 'MI-3B';

DELETE FROM `kelas` WHERE `kode_kelas` = 'MI-3B';

SELECT COUNT(NIM)
FROM mahasiswa;

SELECT nim, nama, TTL
FROM mahasiswa
ORDER BY TTL ASC;

SELECT `nim
`, `nama`, `jenis-kelamin`, `alamat` FROM mahasiswa WHERE nama like '%s%';

    SELECT nim
    FROM mahasiswa
UNION ALL
    SELECT nip
    FROM dosen;

DESC mahasiswa;
DESC dosen;
DESC mata_kuliah;
DESC kelas;
DESC jadwal_kuliah;
DESC nilai;