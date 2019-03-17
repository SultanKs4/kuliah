CREATE TABLE `dosen`
( `kd_dosen` INT
(4) PRIMARY KEY, `nama_dosen` VARCHAR
(50));
CREATE TABLE `mata_kuliah`
( `kode_mk` CHAR
(5), `nama_mk` VARCHAR
(20));
CREATE TABLE `jadwal`
( `kode_mk` CHAR
(5) , `hari` VARCHAR
(10) , `jam_ke` CHAR
(3) , `kelas` VARCHAR
(6) , `ruang` VARCHAR
(5));
INSERT INTO `dosen` (`
kd_dosen`,
`nama_dosen
`) VALUES
('102', 'Susilowati');
INSERT INTO `dosen` (`
kd_dosen`,
`nama_dosen
`) VALUES
('105', 'Prof. Bajuri');
INSERT INTO `dosen` (`
kd_dosen`,
`nama_dosen
`) VALUES
('109', 'Timbul, PhD.');
INSERT INTO `mata_kuliah` (`
kode_mk`,
`nama_mk
`) VALUES
('EL230', 'Fisika 1');
INSERT INTO `mata_kuliah` (`
kode_mk`,
`nama_mk
`) VALUES
('EL230', 'Fisika 2');
INSERT INTO `mata_kuliah` (`
kode_mk`,
`nama_mk
`) VALUES
('EL440', 'Pemrograman');
INSERT INTO `mata_kuliah` (`
kode_mk`,
`nama_mk
`) VALUES
('EL450', 'Pancasila');
INSERT INTO `jadwal` (`
kode_mk`,
`hari
`, `jam_ke`, `kelas`, `ruang`) VALUES
('EL230', 'Senin', '1-3', 'A, B, C', 'AMP1');
INSERT INTO `jadwal` (`
kode_mk`,
`hari
`, `jam_ke`, `kelas`, `ruang`) VALUES
('EL230', 'Senin', '4-5', 'C, D', 'AMP1');
INSERT INTO `jadwal` (`
kode_mk`,
`hari
`, `jam_ke`, `kelas`, `ruang`) VALUES
('EL440', 'Selasa', '1-3', 'A, B', 'R1');
INSERT INTO `jadwal` (`
kode_mk`,
`hari
`, `jam_ke`, `kelas`, `ruang`) VALUES
('EL440', 'Selasa', '4-6', 'C, D', 'R2');
INSERT INTO `jadwal` (`
kode_mk`,
`hari
`, `jam_ke`, `kelas`, `ruang`) VALUES
('EL450', 'Selasa', '1-3', 'E, F', 'R1');
ALTER TABLE `dosen`
ADD `alamat_dosen` VARCHAR
(50) AFTER `nama_dosen`;
ALTER TABLE `mata_kuliah`
ADD `sks` INT
(5) AFTER `nama_mk`;
ALTER TABLE `mata_kuliah`
ADD `kd_dosen` INT
(4) AFTER `sks`;
ALTER TABLE `mata_kuliah`
ADD CONSTRAINT `fkDosen0` FOREIGN KEY
(`kd_dosen`) REFERENCES `dosen`
(`kd_dosen`);
UPDATE `dosen`
SET
`alamat_dosen` = 'Singosari' WHERE `dosen`.`kd_dosen` = 102;
UPDATE `dosen`
SET
`alamat_dosen` = 'Sawojajar' WHERE `dosen`.`kd_dosen` = 105;
UPDATE `dosen`
SET
`alamat_dosen` = 'Dinoyo' WHERE `dosen`.`kd_dosen` = 109;
UPDATE `mata_kuliah`
SET
`sks` = 20 WHERE `mata_kuliah`.`nama_mk` = 'Fisika 1';
UPDATE `mata_kuliah`
SET
`sks` = 20 WHERE `mata_kuliah`.`nama_mk` = 'Fisika 2';
UPDATE `mata_kuliah`
SET
`sks` = 25 WHERE `mata_kuliah`.`nama_mk` = 'Pemrograman';
UPDATE `mata_kuliah`
SET
`sks` = 18 WHERE `mata_kuliah`.`nama_mk` = 'Pancasila';
UPDATE `mata_kuliah`
SET
`kd_dosen` = 105 WHERE `mata_kuliah`.`nama_mk` = 'Fisika 1';
UPDATE `mata_kuliah`
SET
`kd_dosen` = 105 WHERE `mata_kuliah`.`nama_mk` = 'Fisika 2';
UPDATE `mata_kuliah`
SET
`kd_dosen` = 102 WHERE `mata_kuliah`.`nama_mk` = 'Pemrograman';
UPDATE `mata_kuliah`
SET
`kd_dosen` = 109 WHERE `mata_kuliah`.`nama_mk` = 'Pancasila';
INSERT INTO `mata_kuliah` (`
kode_mk`,
`nama_mk
`, `sks`, `kd_dosen`) VALUES
('EL440', 'Pemrograman 2', '25', '105');
SELECT *
FROM `dosen
`;
SELECT *
FROM `jadwal
`;
SELECT *
FROM `mata_kuliah
`;