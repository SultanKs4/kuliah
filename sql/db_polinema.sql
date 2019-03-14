create table mahasiswa (nim int(8) primary key, nama_mhs char(50),jenis_kelamin enum('L','P') default 'L', alamat varchar
(12),kota varchar
(20) default 'malang',asal_sma char
(30),no_hp varchar
(12),umur integer,kode_prodi char
(6),foreign key fk0
(kode_prodi) references prodi
(kode_prodi));
create table prodi
(
    kode_prodi char(6) primary key,
    nama_prodi char(30)
);
create table mata_kuliah
(
    mk_id char(10) primary key,
    nama_mk char(50),
    jumlah_jam float(4,2),
    sks integer
);
create table ruang
(
    ruang_id char(3) primary key,
    nama_ruang char(20),
    kapasitas integer
);
create table dosen (nidn integer(20) primary key,nama_dosen char(50), status enum('PNS','KONTRAK') default 'PNS',jenis_kelamin enum
('L','P') default 'L',no_hp varchar
(15));
alter table `mahasiswa`
ADD `agama` varchar
(10) after `kode_prodi`;
ALTER TABLE `dosen`
ADD `alamat` VARCHAR
(50) AFTER `no_hp`;
DESC mahasiswa;
INSERT INTO `dosen` (`
nidn`,
`nama_dosen
`, `status`, `jenis_kelamin`, `no_hp`, `alamat`) VALUES
('123456789', 'Sultan Achmad Qum Masykuro NS', 'PNS', 'L', '087739491570', 'BLKI Singosari No.40');
INSERT INTO `prodi` (`
kode_prodi`,
`nama_prodi
`) VALUES
('666', 'Teknik Informatika');
INSERT INTO `mata_kuliah` (`
mk_id`,
`nama_mk
`, `jumlah_jam`, `sks`) VALUES
('11', 'Database Management System', '6', '12');
INSERT INTO `ruang` (`
ruang_id`,
`nama_ruang
`, `kapasitas`) VALUES
('1', 'LSI-1', '60');
INSERT INTO `mahasiswa` (`
nim`,
`nama_mhs
`, `jenis_kelamin`, `alamat`, `kota`, `asal_sma`, `no_hp`, `umur`, `kode_prodi`, `agama`) VALUES
('1841720019', 'Huzam Kazim', 'L', 'Senggani', 'malang', 'SMA Negeri 3 Malang', '081330736498', '20', '666', 'Islam');
SELECT *
FROM `mahasiswa
`;
ALTER TABLE `mahasiswa`
DROP `asal_sma`;
