CREATE TABLE `siakad_project`.`mahasiswa`
( `nim` INT
(20) NOT NULL , `nama` VARCHAR
(50) NOT NULL , `nik` INT
(20) NOT NULL , `kota_lahir` VARCHAR
(20) NOT NULL , `TTL` DATE NOT NULL , `agama` INT
(1) NOT NULL , `jenis_kelamin` INT
(1) NOT NULL , `golongan_darah` INT
(1) NOT NULL , `no_telp` INT
(15) NOT NULL , `alamat` VARCHAR
(255) NOT NULL , `email` VARCHAR
(30) NOT NULL , PRIMARY KEY
(`nim`)) ENGINE = InnoDB;

CREATE TABLE `siakad_project`.`alamat_mahasiswa`
( `jalan` VARCHAR
(255) NOT NULL , `kecamatan` VARCHAR
(50) NOT NULL , `kota` VARCHAR
(50) NOT NULL , `kode_pos` INT
(10) NOT NULL , PRIMARY KEY
(`jalan`)) ENGINE = InnoDB;

ALTER TABLE `mahasiswa`
ADD FOREIGN KEY
(`alamat`) REFERENCES `alamat_mahasiswa`
(`jalan`) ON
DELETE CASCADE ON
UPDATE CASCADE;

CREATE TABLE `siakad_project`.`agama`
( `kode_agama` INT
(1) NOT NULL , `nama_agama` VARCHAR
(20) NOT NULL , PRIMARY KEY
(`kode_agama`)) ENGINE = InnoDB;

ALTER TABLE `mahasiswa`
ADD FOREIGN KEY
(`agama`) REFERENCES `agama`
(`kode_agama`) ON
DELETE NO ACTION ON
UPDATE NO ACTION;

CREATE TABLE `siakad_project`.`jenis_kelamin`
( `kode_jk` INT
(1) NOT NULL , `nama_jk` VARCHAR
(15) NOT NULL , PRIMARY KEY
(`kode_jk`)) ENGINE = InnoDB;

ALTER TABLE `mahasiswa`
ADD FOREIGN KEY
(`jenis_kelamin`) REFERENCES `jenis_kelamin`
(`kode_jk`) ON
DELETE NO ACTION ON
UPDATE NO ACTION;

CREATE TABLE `siakad_project`.`golongan_darah`
( `kode_goldar` INT
(1) NOT NULL , `jenis_goldar` VARCHAR
(2) NOT NULL , PRIMARY KEY
(`kode_goldar`)) ENGINE = InnoDB;

ALTER TABLE `mahasiswa`
ADD FOREIGN KEY
(`golongan_darah`) REFERENCES `golongan_darah`
(`kode_goldar`) ON
DELETE NO ACTION ON
UPDATE NO ACTION;

CREATE TABLE `siakad_project`.`data_sekolah_mhs`
( `nim` INT
(20) NOT NULL , `nama_sekolah` VARCHAR
(50) NOT NULL , `nilai_UN` FLOAT NOT NULL , `jml_pel` INT
(1) NOT NULL , `nisn` INT
(15) NOT NULL , `nilai_avg_un` FLOAT NOT NULL , PRIMARY KEY
(`nim`)) ENGINE = InnoDB;

ALTER TABLE `data_sekolah_mhs`
ADD FOREIGN KEY
(`nim`) REFERENCES `mahasiswa`
(`nim`) ON
DELETE RESTRICT ON
UPDATE RESTRICT;

CREATE TABLE `siakad_project`.`data_keluarga_mhs`
( `nim` INT
(20) NOT NULL , `nik_ayah` INT
(20) NOT NULL , `nik_ibu` INT
(20) NOT NULL , `nama_ayah` VARCHAR
(50) NOT NULL , `nama_ibu` VARCHAR
(50) NOT NULL , PRIMARY KEY
(`nim`)) ENGINE = InnoDB;

ALTER TABLE `data_keluarga_mhs`
ADD FOREIGN KEY
(`nim`) REFERENCES `mahasiswa`
(`nim`) ON
DELETE RESTRICT ON
UPDATE RESTRICT;

CREATE TABLE `siakad_project`.`dosen`
( `nip` INT
(20) NOT NULL , `nama` VARCHAR
(50) NOT NULL , `TTL` DATE NOT NULL , `jenis_kelamin` INT
(1) NOT NULL , `agama` INT
(1) NOT NULL , `golongan_darah` INT
(1) NOT NULL , `no.telp` INT
(15) NOT NULL , `alamat` VARCHAR
(255) NOT NULL , `email` VARCHAR
(30) NOT NULL , PRIMARY KEY
(`nip`)) ENGINE = InnoDB;

ALTER TABLE `dosen`
ADD UNIQUE
(`nama`);

CREATE TABLE `siakad_project`.`alamat_dosen`
( `nip` INT
(20) NOT NULL , `jalan` VARCHAR
(255) NOT NULL , `kecamatan` VARCHAR
(50) NOT NULL , `kota` VARCHAR
(50) NOT NULL , `kode_pos` INT
(10) NOT NULL , PRIMARY KEY
(`nip`), UNIQUE
(`jalan`)) ENGINE = InnoDB;

ALTER TABLE `alamat_dosen`
ADD FOREIGN KEY
(`nip`) REFERENCES `dosen`
(`nip`) ON
DELETE RESTRICT ON
UPDATE RESTRICT;

CREATE TABLE `siakad_project`.`mata_kuliah`
( `kode_mk` INT
(5) NOT NULL , `nama_mk` VARCHAR
(50) NOT NULL , `dosen` VARCHAR
(50) NOT NULL , PRIMARY KEY
(`kode_mk`)) ENGINE = InnoDB;

ALTER TABLE `mata_kuliah`
ADD FOREIGN KEY
(`dosen`) REFERENCES `dosen`
(`nama`) ON
DELETE RESTRICT ON
UPDATE RESTRICT;

CREATE TABLE `siakad_project`.`jadwal_kulaih`
( `jadwal_id` INT
(255) NOT NULL AUTO_INCREMENT , `kode_mk` INT
(5) NOT NULL , `jam` INT
(3) NOT NULL , `hari` INT
(1) NOT NULL , `kelas` INT
(5) NOT NULL , `ruang` INT
(3) NOT NULL , PRIMARY KEY
(`jadwal_id`)) ENGINE = InnoDB;

ALTER TABLE `jadwal_kuliah`
ADD FOREIGN KEY
(`kode_mk`) REFERENCES `mata_kuliah`
(`kode_mk`) ON
DELETE RESTRICT ON
UPDATE RESTRICT;

CREATE TABLE `siakad_project`.`kode_jam`
( `kode_jam` INT
(3) NOT NULL , `keterangan_jam` VARCHAR
(30) NOT NULL , PRIMARY KEY
(`kode_jam`)) ENGINE = InnoDB;

ALTER TABLE `jadwal_kulaih`
ADD FOREIGN KEY
(`jam`) REFERENCES `kode_jam`
(`kode_jam`) ON
DELETE RESTRICT ON
UPDATE RESTRICT;

CREATE TABLE `siakad_project`.`kode_hari`
( `kode_hari` INT
(1) NOT NULL , `keterangan_hari` VARCHAR
(15) NOT NULL , PRIMARY KEY
(`kode_hari`)) ENGINE = InnoDB;

CREATE TABLE `siakad_project`.`kode_kelas`
( `kode_kelas` INT
(5) NOT NULL , `nama_kelas` VARCHAR
(10) NOT NULL , `Detail_nama` VARCHAR
(255) NOT NULL , PRIMARY KEY
(`kode_kelas`)) ENGINE = InnoDB;

CREATE TABLE `siakad_project`.`kode_ruang`
( `kode_ruang` INT
(3) NOT NULL , `nama_ruang` VARCHAR
(50) NOT NULL , PRIMARY KEY
(`kode_ruang`)) ENGINE = InnoDB;

ALTER TABLE `jadwal_kuliah`
ADD FOREIGN KEY
(`hari`) REFERENCES `kode_hari`
(`kode_hari`) ON
DELETE RESTRICT ON
UPDATE RESTRICT;

ALTER TABLE `jadwal_kuliah`
ADD FOREIGN KEY
(`kelas`) REFERENCES `kode_kelas`
(`kode_kelas`) ON
DELETE RESTRICT ON
UPDATE RESTRICT;

ALTER TABLE `jadwal_kuliah`
ADD FOREIGN KEY
(`ruang`) REFERENCES `kode_ruang`
(`kode_ruang`) ON
DELETE RESTRICT ON
UPDATE RESTRICT;

CREATE TABLE `siakad_project`.`UKT`
( `ukt_id` INT
(255) NOT NULL AUTO_INCREMENT , `nim` INT
(20) NOT NULL , `tahun_akademik` VARCHAR
(50) NOT NULL , `keterangan` VARCHAR
(50) NOT NULL , `tagihan` INT
(8) NOT NULL , `terbayar` INT
(8) NOT NULL , `keringanan` INT
(8) NOT NULL , `kewajiban` INT
(8) NOT NULL , `status` INT
(1) NOT NULL , PRIMARY KEY
(`ukt_id`)) ENGINE = InnoDB;

CREATE TABLE `siakad_project`.`status_ukt`
( `status_ukt_id` INT
(1) NOT NULL , `keterangan_ukt` VARCHAR
(15) NOT NULL , PRIMARY KEY
(`status_ukt_id`)) ENGINE = InnoDB;

ALTER TABLE `UKT`
ADD FOREIGN KEY
(`nim`) REFERENCES `mahasiswa`
(`nim`) ON
DELETE RESTRICT ON
UPDATE RESTRICT;

ALTER TABLE `UKT`
ADD FOREIGN KEY
(`status`) REFERENCES `status_ukt`
(`status_ukt_id`) ON
DELETE RESTRICT ON
UPDATE RESTRICT;

CREATE TABLE `siakad_project`.`presensi`
( `presensi_no` INT
(255) NOT NULL AUTO_INCREMENT , `nim` INT
(20) NOT NULL , `kode_mk` VARCHAR
(15) NOT NULL , `pertemuan` INT
(5) NOT NULL , `tanggal` DATE NOT NULL , `sakit` INT
(5) NOT NULL , `izin` INT
(5) NOT NULL , `alpha` INT
(5) NOT NULL , PRIMARY KEY
(`presensi_no`)) ENGINE = InnoDB;

ALTER TABLE `presensi`
ADD FOREIGN KEY
(`nim`) REFERENCES `mahasiswa`
(`nim`) ON
DELETE RESTRICT ON
UPDATE RESTRICT;
ALTER TABLE `presensi`
ADD FOREIGN KEY
(`kode_mk`) REFERENCES `mata_kuliah`
(`kode_mk`) ON
DELETE RESTRICT ON
UPDATE RESTRICT;

CREATE TABLE `siakad_project`.`kartu_rencana_studi`
( `krs_no` INT
(255) NOT NULL AUTO_INCREMENT , `nim` INT
(20) NOT NULL , `tahun_akademik` VARCHAR
(15) NOT NULL , `kelas` INT
(1) NOT NULL , `semester` INT
(1) NOT NULL , `SKS` INT
(3) NOT NULL , `jam` INT
(3) NOT NULL , `IP_Semester_lalu` FLOAT NULL , PRIMARY KEY
(`krs_no`)) ENGINE = InnoDB;

ALTER TABLE `kartu_rencana_studi`
ADD FOREIGN KEY
(`nim`) REFERENCES `mahasiswa`
(`nim`) ON
DELETE RESTRICT ON
UPDATE RESTRICT;
ALTER TABLE `kartu_rencana_studi`
ADD FOREIGN KEY
(`kelas`) REFERENCES `kode_kelas`
(`kode_kelas`) ON
DELETE RESTRICT ON
UPDATE RESTRICT;

CREATE TABLE `siakad_project`.`kartu_hasil_studi`
( `khs_no` INT
(255) NOT NULL AUTO_INCREMENT , `nim` INT
(15) NOT NULL , `kode_mk` VARCHAR
(15) NOT NULL , `nilai` VARCHAR
(1) NOT NULL , PRIMARY KEY
(`khs_no`)) ENGINE = InnoDB;

CREATE TABLE `siakad_project`.`index_nilai`
( `nilai` VARCHAR
(1) NOT NULL , `keterangan_nilai` VARCHAR
(10) NOT NULL , PRIMARY KEY
(`nilai`)) ENGINE = InnoDB;

ALTER TABLE `kartu_hasil_studi`
ADD FOREIGN KEY
(`nim`) REFERENCES `mahasiswa`
(`nim`) ON
DELETE RESTRICT ON
UPDATE RESTRICT;
ALTER TABLE `kartu_hasil_studi`
ADD FOREIGN KEY
(`kode_mk`) REFERENCES `mata_kuliah`
(`kode_mk`) ON
DELETE RESTRICT ON
UPDATE RESTRICT;
ALTER TABLE `kartu_hasil_studi`
ADD FOREIGN KEY
(`nilai`) REFERENCES `index_nilai`
(`nilai`) ON
DELETE RESTRICT ON
UPDATE RESTRICT;

ALTER TABLE `kartu_hasil_studi`
ADD `tahun_akademik` VARCHAR
(20) NOT NULL AFTER `nim`;
ALTER TABLE `kartu_hasil_studi`
ADD `semester` INT
(2) NOT NULL AFTER `tahun_akademik`;

INSERT INTO `agama` (`
kode_agama`,
`nama_agama
`) VALUES
('1', 'Islam'),
('2', 'Kristen'),
('3', 'Katolik'),
('4', 'Hindu'),
('5', 'Buddha'),
('6', 'Kong Hu Cu')

INSERT INTO `golongan_darah` (`
kode_goldar`,
`jenis_goldar
`) VALUES
('1', 'A'),
('2', 'B'),
('3', 'AB'),
('4', 'O')

INSERT INTO `jenis_kelamin` (`
kode_jk`,
`nama_jk
`) VALUES
('1', 'Laki-Laki'),
('2', 'Perempuan')

desc UKT; desc agama; desc alamat_dosen; desc alamat_mahasiswa; desc data_keluarga_mhs; desc data_sekolah_mhs; desc dosen; desc golongan_darah; desc index_nilai; desc jadwal_kuliah; desc jenis_kelamin; desc kartu_hasil_studi; desc kartu_rencana_studi;