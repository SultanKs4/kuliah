-- Create Database
CREATE DATABASE siakad_project_v3;

USE siakad_project_v3;

-- Create Table
CREATE TABLE `dosen`
(
    `nip` int
(20) NOT NULL,
    `nama_dosen` varchar
(50) NOT NULL,
    `no-telp_dosen` int
(15) NOT NULL,
    `alamat_dosen` varchar
(255) NOT NULL,
    `email_dosen` varchar
(30) NOT NULL, 
    PRIMARY KEY
(`nip`), 
    UNIQUE KEY `nama_dosen`
(`nama_dosen`)
);

CREATE TABLE `jadwal_kuliah`
(
  `jadwal_AI` int
(11) NOT NULL,
  `nim` int
(20) NOT NULL,
  `kode_mk` varchar
(15) NOT NULL,
  `kode_kelas` varchar
(6) NOT NULL,
  `hari` enum
('Senin','Selasa','Rabu','Kamis','Jum''at') NOT NULL,
  `jam` enum
('7:30-8:30','8:30-9:30','9:30-10:30','10:30-11:30') NOT NULL,
  PRIMARY KEY
(`jadwal_AI`)
);

CREATE TABLE `kelas`
(
  `kode_kelas` varchar
(6) NOT NULL,
  `nama_kelas` varchar
(100) NOT NULL,
  `jumlah_siswa` int
(2) NOT NULL,
  PRIMARY KEY
(`kode_kelas`)
);

CREATE TABLE `mahasiswa`
(
  `nim` int
(20) NOT NULL,
  `nama` varchar
(50) NOT NULL,
  `kota_lahir` varchar
(20) NOT NULL,
  `TTL` date NOT NULL,
  `agama` enum
('Islam','Kristen','Katolik','Hindu','Buddha','Kong Hu Cu') NOT NULL,
  `jenis-kelamin` enum
('Laki-Laki','Perempuan') NOT NULL,
  `golongan-darah` enum
('A','B','AB','O') NOT NULL,
  `no-telp` bigint
(255) NOT NULL,
  `alamat` varchar
(255) NOT NULL,
  `email` varchar
(30) NOT NULL,
  PRIMARY KEY
(`nim`)
);

CREATE TABLE `mata_kuliah`
(
  `kode_mk` varchar
(15) NOT NULL,
  `nama_mk` varchar
(50) NOT NULL,
  `dosen` varchar
(50) NOT NULL,
  PRIMARY KEY
(`kode_mk`)
);

CREATE TABLE `nilai`
(
  `nilai_id` int
(11) NOT NULL,
  `nim` int
(20) NOT NULL,
  `kode_mk` varchar
(15) NOT NULL,
  `dosen` varchar
(50) NOT NULL,
  `nilai` enum
('A','B+','B','C','D','E') NOT NULL,
  PRIMARY KEY
(`nilai_id`)
);

-- Relation Table
ALTER TABLE `jadwal_kuliah`
ADD CONSTRAINT `jadwal_kuliah_ibfk_1` 
FOREIGN KEY (`nim`) REFERENCES `mahasiswa`
(`nim`) ON DELETE NO ACTION ON UPDATE CASCADE,
ADD CONSTRAINT `jadwal_kuliah_ibfk_2`
FOREIGN KEY (`kode_mk`) REFERENCES `mata_kuliah`
(`kode_mk`) ON DELETE NO ACTION ON UPDATE CASCADE,
ADD CONSTRAINT `jadwal_kuliah_ibfk_3`
FOREIGN KEY (`kode_kelas`) REFERENCES `kelas`
(`kode_kelas`) ON DELETE NO ACTION ON UPDATE CASCADE;

ALTER TABLE `mata_kuliah`
ADD CONSTRAINT `mata_kuliah_ibfk_1` 
FOREIGN KEY (`dosen`) REFERENCES `dosen`
(`nama_dosen`) ON DELETE NO ACTION ON UPDATE CASCADE;

ALTER TABLE `nilai`
ADD CONSTRAINT `nilai_ibfk_1`
FOREIGN KEY (`nim`) REFERENCES `mahasiswa`
(`nim`) ON DELETE NO ACTION ON UPDATE CASCADE,
ADD CONSTRAINT `nilai_ibfk_2` 
FOREIGN KEY (`kode_mk`) REFERENCES `mata_kuliah`
(`kode_mk`) ON DELETE NO ACTION ON UPDATE CASCADE,
ADD CONSTRAINT `nilai_ibfk_3` 
FOREIGN KEY (`dosen`) REFERENCES `dosen`
(`nama_dosen`) ON DELETE NO ACTION ON UPDATE CASCADE;

-- Input data
INSERT INTO `dosen` VALUES
(123456789, 'Achmad', 8321838, 'RumNas Poltek', 'hehe@poltek.com'),
(361634792, 'Udin', 83128471, 'batu', 'udin@gmail.com'),
(412312412, 'David Simanjuntak', 837135123, 'Sumberwuni no 60', 'dapid@gmail.com'),
(624614149, 'Reza Kirkman', 812481732, 'karang wetang no 10', 'rezak@gmail.com'),
(731746124, 'Siti Kriswandari', 853817374, 'candirenggo gang iv', 'kriswandari@gmail.com'),
(812737412, 'Arifin', 812734612, 'thamrin no 69', 'arifin@gmail.com'),
(987654213, 'Abdul', 9876783, 'Kembang Turi', 'kkkk@poltek.com');

INSERT INTO `mahasiswa` VALUES
(8147184, 'Ardan', 'Bojonegoro', '2019-05-05', 'Islam', 'Laki-Laki', 'AB', 34755656, 'gang motar', 'ardan@yahoo.com'),
(1831710002, 'Grace', 'Jakarta', '2000-10-10', 'Kristen', 'Perempuan', 'O', 8783291874, 'suhat no 60', 'grace@gmail.com'),
(1831710009, 'Susan', 'Jakarta', '2019-03-06', 'Katolik', 'Perempuan', 'O', 85933024702, 'Kembang Tulip', 'susanti@gmail.com'),
(1831710050, 'Risa', 'Jogja', '2000-12-12', 'Katolik', 'Perempuan', 'B', 82748192274, 'dinoyo no 90', 'risa@gmail.com'),
(1831710200, 'Made', 'Bali', '2019-05-05', 'Hindu', 'Laki-Laki', 'A', 8228381204, 'gang piranha atas', 'made@gmail.com'),
(1841720001, 'Christy', 'Malang', '2019-05-13', 'Kristen', 'Perempuan', 'O', 81330736498, 'Semanggi Timur', 'chris@gmail.com'),
(1841720006, 'Doni', 'Malang', '1999-05-10', 'Islam', 'Laki-Laki', 'AB', 8137418273, 'letjen sutoyo 50', 'doni@gmail.com'),
(1841720019, 'Sultan Achmad Qum', 'Malang', '1999-11-08', 'Islam', 'Laki-Laki', 'O', 881245312, 'Rumdin BLKI 40', 'sultangendut@gmail.com'),
(1841720099, 'Arya', 'Kediri', '2019-01-10', 'Islam', 'Laki-Laki', 'AB', 89930241824, 'T. Listrik', 'kasbi@gmail.com'),
(1841720199, 'Santi', 'Malang', '2019-05-20', 'Islam', 'Perempuan', 'A', 87739491570, 'S. Parman 20', 'tisanti@gmail.com'),
(1841720213, 'Abdurrasyid Muhasibi', 'Blitar', '2000-06-15', 'Islam', 'Laki-Laki', 'B', 892819312, 'Semanggi Barat Utara', 'rasyid@gmail.com');

INSERT INTO `kelas` VALUES
('MI-1A', 'Manajemen Informatika 1 A', 30),
('MI-1B', 'Manajemen Informatika 1 B', 30),
('MI-2A', 'Manajemen Informatika 2 A', 30),
('MI-2B', 'Manajemen Informatika 2 B', 30),
('TI-1A', 'Teknik Informatika 1 A', 32),
('TI-1B', 'Teknik Informatika 1 B', 29),
('TI-2A', 'Teknik Informatika 2 A', 30);

INSERT INTO `mata_kuliah` VALUES
('RTL11100', 'Algoritma Struktur Data Teori', 'Udin'),
('RTL11101', 'Algoritma Struktur Data Praktikum', 'Udin'),
('RTL11110', 'Bahasa Inggris 2', 'Reza Kirkman'),
('RTL11120', 'Sistem Operasi', 'Arifin'),
('RTL21341', 'Basis Data Praktikum', 'Achmad'),
('RTL31324', 'Basis Data Teori', 'Achmad'),
('RTL41553', 'Agama', 'Abdul'),
('RTL71837', 'Aljabar Linier', 'Abdul');

INSERT INTO `jadwal_kuliah` VALUES
(1, 1841720019, 'RTL21341', 'TI-1A', 'Senin', '8:30-9:30'),
(2, 1841720019, 'RTL41553', 'TI-1A', 'Selasa', '7:30-8:30'),
(3, 1841720006, 'RTL11100', 'MI-1B', 'Selasa', '9:30-10:30'),
(4, 1831710009, 'RTL11110', 'MI-2B', 'Rabu', '7:30-8:30'),
(5, 1841720199, 'RTL11101', 'TI-2A', 'Senin', '10:30-11:30'),
(6, 1841720001, 'RTL31324', 'MI-1A', 'Jum\'at', '7:30-8:30'),
(7, 1841720213, 'RTL71837', 'TI-1B', 'Kamis', '9:30-10:30'),
(8, 1831710050, 'RTL11120', 'MI-2A', 'Selasa', '10:30-11:30'),
(9, 1841720006, 'RTL31324', 'TI-2A', 'Senin', '7:30-8:30'),
(10, 8147184, 'RTL21341', 'MI-2B', 'Rabu', '7:30-8:30');

INSERT INTO `nilai` VALUES
(1, 1841720019, 'RTL21341', 'Achmad', 'A'),
(2, 1841720019, 'RTL41553', 'Abdul', 'A'),
(3, 1841720006, 'RTL11110', 'Reza Kirkman', 'B'),
(4, 1841720199, 'RTL11100', 'Udin', 'B+'),
(5, 1831710200, 'RTL71837', 'Abdul', 'C'),
(6, 1831710002, 'RTL11101', 'Udin', 'D'),
(7, 1841720001, 'RTL11110', 'Reza Kirkman', 'B+'),
(8, 1831710050, 'RTL71837', 'Abdul', 'A'),
(9, 1841720213, 'RTL11120', 'Arifin', 'D'),
(10, 1841720099, 'RTL11120', 'Arifin', 'B+');

-- DDL DEMO Query
CREATE TABLE `ddlQuery`
( `nim` CHAR
(20) NOT NULL , `nama_ddl` CHAR
(50) NOT NULL , `umur` INT NOT NULL , PRIMARY KEY
(`nim`));

ALTER TABLE `ddlQuery`
ADD `newAlter` VARCHAR
(20) NOT NULL AFTER `nama_ddl`;

DROP TABLE `ddlQuery`;


-- DML DEMO Query
INSERT INTO `
kelas`
VALUES
    ('TI-4A', 'Teknik Informatika 5 A', 50);

UPDATE `kelas`
SET
`nama_kelas` = 'Teknik Informatika 4 A', `jumlah_siswa` = '30' WHERE `kode_kelas` = 'TI-4A';

DELETE FROM `kelas` WHERE `kode_kelas` = 'TI-4A';


-- SELECT DEMO Query
SELECT COUNT(NIM) AS 'NIM_JUMLAH'
FROM mahasiswa;

SELECT nim
FROM mahasiswa
WHERE nim IN(SELECT nim
FROM nilai);

SELECT nim, nama, TTL
FROM mahasiswa
ORDER BY TTL ASC;

SELECT `nim`, `nama`, `jenis-kelamin`, `alamat` FROM mahasiswa WHERE nama like '%s%';

SELECT nim, nama, alamat
FROM mahasiswa
WHERE nim > ALL (SELECT nim
FROM nilai
WHERE nim = 1841720019);

    SELECT nim
    FROM mahasiswa
UNION
    SELECT nim
    FROM nilai;

SELECT nim AS id, nama
AS `Nama Dosen/Mahasiswa` FROM mahasiswa UNION
SELECT nip, nama_dosen
FROM dosen;

SELECT `mahasiswa`.`nim
` AS `NIM`,`mahasiswa`.`nama` AS `Nama Mahasiswa`,`mata_kuliah`.`nama_mk` AS `Nama Mata Kuliah`,`nilai`.`nilai` AS `Nilai Huruf` FROM mahasiswa,mata_kuliah,nilai WHERE `mahasiswa`.`nim`= `nilai`.`nim` AND `mata_kuliah`.`kode_mk` = `nilai`.`kode_mk` ORDER BY `Nilai Huruf` ASC;

SELECT nilai, COUNT(nilai) AS `Jumlah (Urut dari yang terbanyak)` FROM nilai GROUP BY nilai ORDER BY COUNT(nilai) DESC;

DESC mahasiswa;
DESC dosen;
DESC mata_kuliah;
DESC kelas;
DESC jadwal_kuliah;
DESC nilai;