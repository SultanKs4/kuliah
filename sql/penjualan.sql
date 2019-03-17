CREATE TABLE `transaksi`
( `no_transaksi` INT
(20) NOT NULL PRIMARY KEY , `kode_mobil` INT
(20) NOT NULL , `jml_jual` INT
(4) NOT NULL);
CREATE TABLE `mobil`
( `kode_mobil` INT
(20) NOT NULL PRIMARY KEY, `nama_mobil` VARCHAR
(50) NOT NULL , `tipe_mobil` VARCHAR
(30) NOT NULL , `harga` INT
(15) NOT NULL , `jenis_mobil` VARCHAR
(20) NOT NULL);

ALTER TABLE `transaksi`
ADD CONSTRAINT `fk0KodeMobil` FOREIGN KEY
(`kode_mobil`) REFERENCES `mobil`
(`kode_mobil`) ON
DELETE RESTRICT ON
UPDATE RESTRICT;

INSERT INTO `mobil` (`
kode_mobil`,
`nama_mobil
`, `tipe_mobil`, `harga`, `jenis_mobil`) VALUES
('1', 'Toyota Alphard', '2.4 G', '906000000', 'Mobil Keluarga');
INSERT INTO `mobil` (`
kode_mobil`,
`nama_mobil
`, `tipe_mobil`, `harga`, `jenis_mobil`) VALUES
('2', 'Toyota Alphard', '3.5 G', '1112000000', 'Mobil Keluarga');
INSERT INTO `mobil` (`
kode_mobil`,
`nama_mobil
`, `tipe_mobil`, `harga`, `jenis_mobil`) VALUES
('3', 'Toyota Avanza', '1.3 G A/T', '158050000', 'Mobil Keluarga');
INSERT INTO `mobil` (`
kode_mobil`,
`nama_mobil
`, `tipe_mobil`, `harga`, `jenis_mobil`) VALUES
('4', 'Toyota Camry', '2.4 G A/T LUX', '462200000', 'Sedan');
INSERT INTO `mobil` (`
kode_mobil`,
`nama_mobil
`, `tipe_mobil`, `harga`, `jenis_mobil`) VALUES
('5', 'Toyota Camry', '3.5 Q A/T', '647000000', 'Sedan');
INSERT INTO `mobil` (`
kode_mobil`,
`nama_mobil
`, `tipe_mobil`, `harga`, `jenis_mobil`) VALUES
('6', 'Toyota Corolla Altis', '1.8 G A/T', '346700000', 'Sedan');
INSERT INTO `mobil` (`
kode_mobil`,
`nama_mobil
`, `tipe_mobil`, `harga`, `jenis_mobil`) VALUES
('7', 'Toyota Corolla Altis', '2.0 V A/T', '375500000', 'Sedan');
INSERT INTO `mobil` (`
kode_mobil`,
`nama_mobil
`, `tipe_mobil`, `harga`, `jenis_mobil`) VALUES
('8', 'Toyota Dyna', '130 HT', '220000000', 'Mini Truk');
INSERT INTO `mobil` (`
kode_mobil`,
`nama_mobil
`, `tipe_mobil`, `harga`, `jenis_mobil`) VALUES
('9', 'Toyota Fortuner', '2.5 G M/T', '363700000', 'SUV');
INSERT INTO `mobil` (`
kode_mobil`,
`nama_mobil
`, `tipe_mobil`, `harga`, `jenis_mobil`) VALUES
('10', 'Toyota Fortuner', '2.7 G Lux A/T', '421300000', 'SUV');
INSERT INTO `mobil` (`
kode_mobil`,
`nama_mobil
`, `tipe_mobil`, `harga`, `jenis_mobil`) VALUES
('11', 'Toyota Fortuner', '2.7 V A/T', '470300000', 'SUV');
INSERT INTO `mobil` (`
kode_mobil`,
`nama_mobil
`, `tipe_mobil`, `harga`, `jenis_mobil`) VALUES
('12', 'Toyota Hilux', 'D Cab E', '302500000', 'Pick Up');
INSERT INTO `mobil` (`
kode_mobil`,
`nama_mobil
`, `tipe_mobil`, `harga`, `jenis_mobil`) VALUES
('13', 'Toyota Kijang Innova', 'E M/T Gasoline', '210000000', 'Mobil Keluarga');
INSERT INTO `mobil` (`
kode_mobil`,
`nama_mobil
`, `tipe_mobil`, `harga`, `jenis_mobil`) VALUES
('14', 'Toyota Kijang Innova', 'G M/T Luxury Gasoline ', '230600000', 'Mobil Keluarga');
INSERT INTO `mobil` (`
kode_mobil`,
`nama_mobil
`, `tipe_mobil`, `harga`, `jenis_mobil`) VALUES
('15', 'Toyota Kijang Innova', 'J M/T Gasoline', '181400000', 'Mobil Keluarga');

INSERT INTO `transaksi` (`
no_transaksi`,
`kode_mobil
`, `jml_jual`) VALUES
('1', '1', '2');
INSERT INTO `transaksi` (`
no_transaksi`,
`kode_mobil
`, `jml_jual`) VALUES
('2', '2', '78');
INSERT INTO `transaksi` (`
no_transaksi`,
`kode_mobil
`, `jml_jual`) VALUES
('3', '3', '22');
INSERT INTO `transaksi` (`
no_transaksi`,
`kode_mobil
`, `jml_jual`) VALUES
('4', '4', '21');
INSERT INTO `transaksi` (`
no_transaksi`,
`kode_mobil
`, `jml_jual`) VALUES
('5', '5', '43');
INSERT INTO `transaksi` (`
no_transaksi`,
`kode_mobil
`, `jml_jual`) VALUES
('6', '6', '10');
INSERT INTO `transaksi` (`
no_transaksi`,
`kode_mobil
`, `jml_jual`) VALUES
('7', '7', '14');
INSERT INTO `transaksi` (`
no_transaksi`,
`kode_mobil
`, `jml_jual`) VALUES
('8', '8', '31');
INSERT INTO `transaksi` (`
no_transaksi`,
`kode_mobil
`, `jml_jual`) VALUES
('9', '9', '11');
INSERT INTO `transaksi` (`
no_transaksi`,
`kode_mobil
`, `jml_jual`) VALUES
('10', '10', '54');
INSERT INTO `transaksi` (`
no_transaksi`,
`kode_mobil
`, `jml_jual`) VALUES
('11', '11', '5');
INSERT INTO `transaksi` (`
no_transaksi`,
`kode_mobil
`, `jml_jual`) VALUES
('12', '12', '4');
INSERT INTO `transaksi` (`
no_transaksi`,
`kode_mobil
`, `jml_jual`) VALUES
('13', '13', '21');
INSERT INTO `transaksi` (`
no_transaksi`,
`kode_mobil
`, `jml_jual`) VALUES
('14', '14', '11');
INSERT INTO `transaksi` (`
no_transaksi`,
`kode_mobil
`, `jml_jual`) VALUES
('15', '15', '21');

ALTER TABLE `transaksi`
ADD `tgl_transaksi` DATE AFTER `jml_jual`;
UPDATE `transaksi`
SET
`tgl_transaksi` = '2019-03-13' WHERE `transaksi`.`no_transaksi` = 1;
UPDATE `transaksi`
SET
`tgl_transaksi` = '2019-03-13' WHERE `transaksi`.`no_transaksi` = 2;
UPDATE `transaksi`
SET
`tgl_transaksi` = '2019-03-13' WHERE `transaksi`.`no_transaksi` = 3;
UPDATE `transaksi`
SET
`tgl_transaksi` = '2019-03-13' WHERE `transaksi`.`no_transaksi` = 4;
UPDATE `transaksi`
SET
`tgl_transaksi` = '2019-03-13' WHERE `transaksi`.`no_transaksi` = 5;
UPDATE `transaksi`
SET
`tgl_transaksi` = '2019-03-13' WHERE `transaksi`.`no_transaksi` = 6;
UPDATE `transaksi`
SET
`tgl_transaksi` = '2019-03-13' WHERE `transaksi`.`no_transaksi` = 7;
UPDATE `transaksi`
SET
`tgl_transaksi` = '2019-03-13' WHERE `transaksi`.`no_transaksi` = 8;
UPDATE `transaksi`
SET
`tgl_transaksi` = '2019-03-13' WHERE `transaksi`.`no_transaksi` = 9;
UPDATE `transaksi`
SET
`tgl_transaksi` = '2019-03-13' WHERE `transaksi`.`no_transaksi` = 10;
UPDATE `transaksi`
SET
`tgl_transaksi` = '2019-03-13' WHERE `transaksi`.`no_transaksi` = 11;
UPDATE `transaksi`
SET
`tgl_transaksi` = '2019-03-13' WHERE `transaksi`.`no_transaksi` = 12;
UPDATE `transaksi`
SET
`tgl_transaksi` = '2019-03-13' WHERE `transaksi`.`no_transaksi` = 13;
UPDATE `transaksi`
SET
`tgl_transaksi` = '2019-03-13' WHERE `transaksi`.`no_transaksi` = 14;
UPDATE `transaksi`
SET
`tgl_transaksi` = '2019-03-13' WHERE `transaksi`.`no_transaksi` = 15;

ALTER TABLE `mobil`
ADD `warna_mobil` VARCHAR
(20) AFTER `jenis_mobil`;
UPDATE `mobil`
SET
`warna_mobil` = 'Hitam' WHERE `mobil`.`kode_mobil` = 1;
UPDATE `mobil`
SET
`warna_mobil` = 'Hitam' WHERE `mobil`.`kode_mobil` = 2;
UPDATE `mobil`
SET
`warna_mobil` = 'Hitam' WHERE `mobil`.`kode_mobil` = 3;
UPDATE `mobil`
SET
`warna_mobil` = 'Hitam' WHERE `mobil`.`kode_mobil` = 4;
UPDATE `mobil`
SET
`warna_mobil` = 'Hitam' WHERE `mobil`.`kode_mobil` = 5;
UPDATE `mobil`
SET
`warna_mobil` = 'Hitam' WHERE `mobil`.`kode_mobil` = 6;
UPDATE `mobil`
SET
`warna_mobil` = 'Hitam' WHERE `mobil`.`kode_mobil` = 7;
UPDATE `mobil`
SET
`warna_mobil` = 'Merah' WHERE `mobil`.`kode_mobil` = 8;
UPDATE `mobil`
SET
`warna_mobil` = 'Hitam' WHERE `mobil`.`kode_mobil` = 9;
UPDATE `mobil`
SET
`warna_mobil` = 'Hitam' WHERE `mobil`.`kode_mobil` = 10;
UPDATE `mobil`
SET
`warna_mobil` = 'Hitam' WHERE `mobil`.`kode_mobil` = 11;
UPDATE `mobil`
SET
`warna_mobil` = 'Hitam' WHERE `mobil`.`kode_mobil` = 12;
UPDATE `mobil`
SET
`warna_mobil` = 'Hitam' WHERE `mobil`.`kode_mobil` = 13;
UPDATE `mobil`
SET
`warna_mobil` = 'Hitam' WHERE `mobil`.`kode_mobil` = 14;
UPDATE `mobil`
SET
`warna_mobil` = 'Hitam' WHERE `mobil`.`kode_mobil` = 15;
