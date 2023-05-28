-- phpMyAdmin SQL Dump
-- version 4.3.11
-- http://www.phpmyadmin.net
--
-- Host: 127.0.0.1
-- Generation Time: Feb 26, 2021 at 06:53 AM
-- Server version: 5.6.24
-- PHP Version: 5.6.8

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8 */;

--
-- Database: `db_pelporpengaduan`
--

-- --------------------------------------------------------

--
-- Table structure for table `fd_masyarakat`
--

CREATE TABLE IF NOT EXISTS `fd_masyarakat` (
  `nik` char(16) NOT NULL,
  `nama` varchar(50) NOT NULL,
  `username` varchar(30) NOT NULL,
  `password` varchar(20) NOT NULL,
  `telp` varchar(13) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Table structure for table `fd_pengaduan`
--

CREATE TABLE IF NOT EXISTS `fd_pengaduan` (
  `id_pengaduan` int(13) NOT NULL,
  `tgl_pengaduan` date NOT NULL,
  `nik` char(16) NOT NULL,
  `isi_laporan` text NOT NULL,
  `foto` blob NOT NULL,
  `status` varchar(30) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Table structure for table `fd_petugas`
--

CREATE TABLE IF NOT EXISTS `fd_petugas` (
  `id_petugas` int(13) NOT NULL,
  `nama_petugas` varchar(35) NOT NULL,
  `username` varchar(30) NOT NULL,
  `password` varchar(20) NOT NULL,
  `telp` varchar(13) NOT NULL,
  `level` varchar(30) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Table structure for table `fd_tanggapan`
--

CREATE TABLE IF NOT EXISTS `fd_tanggapan` (
  `id_tanggapan` int(13) NOT NULL,
  `id_pengaduan` int(13) NOT NULL,
  `tgl_tanggapan` date NOT NULL,
  `tanggapan` text NOT NULL,
  `id_petugas` int(13) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Indexes for dumped tables
--

--
-- Indexes for table `fd_masyarakat`
--
ALTER TABLE `fd_masyarakat`
  ADD PRIMARY KEY (`nik`);

--
-- Indexes for table `fd_pengaduan`
--
ALTER TABLE `fd_pengaduan`
  ADD PRIMARY KEY (`id_pengaduan`), ADD KEY `nik` (`nik`);

--
-- Indexes for table `fd_petugas`
--
ALTER TABLE `fd_petugas`
  ADD PRIMARY KEY (`id_petugas`);

--
-- Indexes for table `fd_tanggapan`
--
ALTER TABLE `fd_tanggapan`
  ADD PRIMARY KEY (`id_tanggapan`), ADD KEY `id_petugas` (`id_petugas`), ADD KEY `id_pengaduan` (`id_pengaduan`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `fd_pengaduan`
--
ALTER TABLE `fd_pengaduan`
  MODIFY `id_pengaduan` int(13) NOT NULL AUTO_INCREMENT;
--
-- AUTO_INCREMENT for table `fd_petugas`
--
ALTER TABLE `fd_petugas`
  MODIFY `id_petugas` int(13) NOT NULL AUTO_INCREMENT;
--
-- AUTO_INCREMENT for table `fd_tanggapan`
--
ALTER TABLE `fd_tanggapan`
  MODIFY `id_tanggapan` int(13) NOT NULL AUTO_INCREMENT;
--
-- Constraints for dumped tables
--

--
-- Constraints for table `fd_pengaduan`
--
ALTER TABLE `fd_pengaduan`
ADD CONSTRAINT `fd_pengaduan_ibfk_1` FOREIGN KEY (`nik`) REFERENCES `fd_masyarakat` (`nik`) ON DELETE CASCADE ON UPDATE CASCADE;

--
-- Constraints for table `fd_tanggapan`
--
ALTER TABLE `fd_tanggapan`
ADD CONSTRAINT `fd_tanggapan_ibfk_1` FOREIGN KEY (`id_pengaduan`) REFERENCES `fd_pengaduan` (`id_pengaduan`) ON DELETE CASCADE ON UPDATE CASCADE,
ADD CONSTRAINT `fd_tanggapan_ibfk_2` FOREIGN KEY (`id_petugas`) REFERENCES `fd_petugas` (`id_petugas`) ON DELETE CASCADE ON UPDATE CASCADE;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
