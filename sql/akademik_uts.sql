CREATE DATABASE `akademik_uts`;

CREATE TABLE Mahasiswa
(
    nim INT(10) NOT NULL PRIMARY KEY ,
    nama_mhs VARCHAR(50) NOT NULL
);

CREATE TABLE `Mata_Kuliah`
( `kode_mk` VARCHAR
(10) NOT NULL , `nama_mk` VARCHAR
(50) NOT NULL , `kode_dosen` VARCHAR
(5) NOT NULL , PRIMARY KEY
(`kode_mk`));

CREATE TABLE `dosen`
( `kode_dosen` VARCHAR
(10) NOT NULL , `nama_dosen` VARCHAR
(50) NOT NULL , PRIMARY KEY
(`kode_dosen`));

CREATE TABLE `nilai`
( `nim` INT
(10) NOT NULL , `kode_mk` VARCHAR
(10) NOT NULL , `nilai_huruf` VARCHAR
(3) NOT NULL);

ALTER TABLE `Mata_Kuliah`
ADD FOREIGN KEY
(`kode_dosen`) REFERENCES `dosen`
(`kode_dosen`) ON
DELETE NO ACTION ON
UPDATE CASCADE;

ALTER TABLE `nilai`
ADD FOREIGN KEY
(`nim`) REFERENCES `Mahasiswa`
(`nim`) ON
DELETE NO ACTION ON
UPDATE CASCADE;

ALTER TABLE `nilai`
ADD FOREIGN KEY
(`kode_mk`) REFERENCES `Mata_Kuliah`
(`kode_mk`) ON
DELETE NO ACTION ON
UPDATE CASCADE;

INSERT INTO `dosen` (`
kode_dosen`,
`nama_dosen
`) VALUES
('EAP', 'Ellanda A. Putri, S.ST., M.Sc.');

INSERT INTO `Mahasiswa` (`
nim`,
`nama_mhs
`) VALUES
(125, 'Christine');

INSERT INTO `Mata_Kuliah` (`
kode_mk`,
`nama_mk
`, `kode_dosen`) VALUES
('MM', 'Multimedia', 'EAP');

SELECT nilai_huruf, COUNT(nilai_huruf)
AS `Jumlah
(Urut dari yang terbanyak)` FROM nilai GROUP BY `Jumlah
(Urut dari yang terbanyak)` ASC;

SELECT nim AS id, nama_mhs
AS `Nama Dosen/Mahasiswa` FROM Mahasiswa UNION
SELECT kode_dosen, nama_dosen
FROM dosen;

SELECT nilai_huruf, COUNT(nilai_huruf)
AS `Jumlah
(Urut dari yang terbanyak)` FROM nilai GROUP BY nilai_huruf ORDER BY COUNT
(nilai_huruf) DESC;

SELECT *
FROM Mahasiswa INNER JOIN nama_tabel_kedua ON nama_kolom_join_tabel_pertama = nama_kolom_join_tabel_kedua;

SELECT `Mahasiswa
`.`nim` AS `NIM`,`Mahasiswa`.`nama_mhs` AS `Nama Mahasiswa`,`Mata_Kuliah`.`nama_mk` AS `Nama Matakuliah`,`nilai`.`nilai_huruf` AS `Nilai Huruf` FROM Mahasiswa,Mata_Kuliah,nilai WHERE `Mahasiswa`.`nim`= `nilai`.`nim` AND `Mata_Kuliah`.`kode_mk` = `nilai`.`kode_mk` ORDER BY `Nilai Huruf`;

select mahasiswa.*, mata_kuliah.nama_mk, nilai.nilai_huruf
from mahasiswa, mata_kuliah, nilai
where mata_kuliah.kode_mk = nilai.kode_mk and mahasiswa.nim = nilai.nim
order by nama_mhs;

select nilai.nim as 'NIM', mahasiswa.nama_mhs as 'Nama Mahasiswa', matakuliah.nama_mk as 'Nama Matakuliah', nilai.nilai_huruf as 'Nilai Huruf'
from mahasiswa, matakuliah, nilai
where mahasiswa.nim = nilai.nim and matakuliah.kode_mk = nilai.kode_mk;