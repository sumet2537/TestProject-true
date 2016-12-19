-- phpMyAdmin SQL Dump
-- version 4.6.4
-- https://www.phpmyadmin.net/
--
-- Host: localhost:8889
-- Generation Time: Dec 19, 2016 at 05:02 AM
-- Server version: 5.6.28
-- PHP Version: 7.0.10

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET time_zone = "+00:00";

--
-- Database: `LoanRequest1`
--

-- --------------------------------------------------------

--
-- Table structure for table `tbl_admin`
--

CREATE TABLE `tbl_admin` (
  `userId` int(11) NOT NULL,
  `username` varchar(50) NOT NULL DEFAULT '',
  `password` varchar(50) DEFAULT '',
  `firstName` varchar(50) DEFAULT NULL,
  `lastName` varchar(50) DEFAULT NULL,
  `sex` varchar(10) DEFAULT NULL,
  `tel` varchar(20) DEFAULT NULL,
  `email` varchar(100) DEFAULT NULL,
  `roleId` int(11) NOT NULL DEFAULT '0',
  `created` timestamp NULL DEFAULT NULL,
  `createBy` varchar(50) DEFAULT NULL,
  `updated` timestamp NULL DEFAULT NULL,
  `updateBy` varchar(50) DEFAULT NULL,
  `status` varchar(1) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Dumping data for table `tbl_admin`
--

INSERT INTO `tbl_admin` (`userId`, `username`, `password`, `firstName`, `lastName`, `sex`, `tel`, `email`, `roleId`, `created`, `createBy`, `updated`, `updateBy`, `status`) VALUES
(1, 'sumet', 'sumet', 'Beeby', 'Thailand', 'Male', '0828553301', 'sothirit.w@gmail.com', 1, '2016-06-12 15:54:18', 'BeebyThailand', '2016-06-12 15:54:18', 'BeebyThailand', '1'),
(2, 'sumat', 'sumat', 'Jojo', 'Thailand', 'Male', '0882345467', 'jojo@gmail.com', 2, '2016-06-12 15:54:18', 'BeebyThailand', '2016-06-12 15:54:18', 'BeebyThailand', '1');

-- --------------------------------------------------------

--
-- Table structure for table `tbl_approveloan`
--

CREATE TABLE `tbl_approveloan` (
  `approve_id` int(11) NOT NULL COMMENT 'รหัสอนุมัติ',
  `bank_id` varchar(50) DEFAULT NULL COMMENT 'รหัสชื่อธนาคาร',
  `loanreq_id` int(11) DEFAULT NULL COMMENT 'รหัสขอสินเชื่อ',
  `citizen_id` varchar(13) DEFAULT NULL,
  `judgment` varchar(150) DEFAULT NULL COMMENT 'ผลการพิจารณา',
  `loanstatusbank` varchar(50) DEFAULT NULL COMMENT 'สถานะ',
  `approvedamount` double DEFAULT NULL COMMENT 'วงเงินอนุมัติเบื่องต้น',
  `installlments` double DEFAULT NULL COMMENT 'ยอดผ่อนชำละต่อเดือน',
  `timerepayment` varchar(2) DEFAULT NULL COMMENT 'ระยะเวลาการผ่อน',
  `position` varchar(50) DEFAULT NULL COMMENT 'ตำแหน่งผู้อนุมัติ',
  `createdby` varchar(50) DEFAULT NULL COMMENT 'ชื่อผู้อนุมัติ',
  `created` timestamp NULL DEFAULT NULL COMMENT 'วันที่สร้าง',
  `updateby` varchar(50) DEFAULT NULL COMMENT 'ชื่อผุ้แก้ไข',
  `updated` timestamp NULL DEFAULT NULL COMMENT 'วันที่แก้ไข'
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Dumping data for table `tbl_approveloan`
--

INSERT INTO `tbl_approveloan` (`approve_id`, `bank_id`, `loanreq_id`, `citizen_id`, `judgment`, `loanstatusbank`, `approvedamount`, `installlments`, `timerepayment`, `position`, `createdby`, `created`, `updateby`, `updated`) VALUES
(2, '12345bkb', 133, '1409800246422', 'ดีใจด้วยคุณผ่านการอนุมัติ กรุณาดำเนินการขั้นต่อไป', 'อนุมัติ', 54000000, 10000, '25', 'หัวหน้า', 'ธนาคาร', '2016-12-15 07:48:32', 'ธนาคาร', '2016-12-15 07:48:32'),
(3, '12345tmb', 133, '1409800246422', 'ดีใจด้วยคุณผ่านการอนุมัติ กรุณาดำเนินการขั้นต่อไป', 'อนุมัติ', 54000000, 10000, '25', 'อ', 'ธนาคาร', '2016-12-15 07:51:43', 'ธนาคาร', '2016-12-15 07:51:43'),
(1, '12345tmb', 136, '1409800246425', 'ดีใจด้วยคุณผ่านการอนุมัติ กรุณาดำเนินการขั้นต่อไป', 'อนุมัติ', 54000000, 10000, '25', 'หัวหน้า', 'ธนาคาร', '2016-12-15 07:48:32', 'ธนาคาร', '2016-12-15 07:48:32'),
(5, '12345bkb', 136, '1409800246424', 'ดีใจด้วยคุณผ่านการอนุมัติ กรุณาดำเนินการขั้นต่อไป', 'อนุมัติ', 54000000, 10000, '25', 'หัวหน้า', 'ธนาคาร', '2016-12-15 07:48:32', 'ธนาคาร', '2016-12-15 07:48:32');

-- --------------------------------------------------------

--
-- Table structure for table `tbl_bank`
--

CREATE TABLE `tbl_bank` (
  `id` int(11) UNSIGNED NOT NULL COMMENT 'ลำดับ',
  `bank_id` varchar(15) DEFAULT NULL COMMENT 'รหัสธนาคาร',
  `bankname` varchar(50) DEFAULT NULL COMMENT 'ชื่อธนาคาร',
  `emailbank` varchar(150) DEFAULT NULL COMMENT 'email'
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Dumping data for table `tbl_bank`
--

INSERT INTO `tbl_bank` (`id`, `bank_id`, `bankname`, `emailbank`) VALUES
(1, '12345bkb', 'กรุงเทพ', 'homeloansystem@gmail.com'),
(2, '12345tmb', 'กรุงไทย', 'homeloansystem@gmail.com'),
(3, '12345tnc', 'กรุงธนชาติ', 'homeloansystem@gmail.com'),
(4, '12345tht', 'ทหารไทย', 'homeloansystem@gmail.com'),
(5, '12345tpn', 'ไทยพาณิชย์', 'homeloansystem@gmail.com'),
(6, '12345tsy', 'กรุงศรีอยุธยา', 'homeloansystem@gmail.com'),
(7, '12345kkt', 'กสิกรไทย', 'homeloansystem@gmail.com');

-- --------------------------------------------------------

--
-- Table structure for table `tbl_bankrequest`
--

CREATE TABLE `tbl_bankrequest` (
  `loanbankreq_id` int(11) UNSIGNED NOT NULL COMMENT 'รหัสธนาคาร',
  `loanreq_id` int(11) DEFAULT NULL COMMENT 'รหัสสินเชื่อ',
  `bank1` varchar(50) DEFAULT NULL COMMENT 'ชื่อธนาคาร',
  `bank2` varchar(50) DEFAULT NULL COMMENT 'ชื่อธนาคาร',
  `bank3` varchar(50) DEFAULT NULL COMMENT 'ชื่อธนาคาร',
  `bank4` varchar(50) DEFAULT NULL COMMENT 'ชื่อธนาคาร',
  `bank5` varchar(50) DEFAULT NULL COMMENT 'ชื่อธนาคาร',
  `bank6` varchar(50) DEFAULT NULL COMMENT 'ชื่อธนาคาร',
  `bank7` varchar(50) DEFAULT NULL COMMENT 'ชื่อธนาคาร',
  `createdd` timestamp NULL DEFAULT NULL COMMENT 'วันที่สร้าง',
  `createdby` varchar(50) DEFAULT NULL COMMENT 'ชื่อผุ้สร้าง',
  `updated` timestamp NULL DEFAULT NULL COMMENT 'วันที่แก้ไข',
  `updateby` varchar(50) DEFAULT NULL COMMENT 'ชื่อผู้แก้ไข'
) ENGINE=MEMORY DEFAULT CHARSET=utf8;

-- --------------------------------------------------------

--
-- Table structure for table `tbl_bureau`
--

CREATE TABLE `tbl_bureau` (
  `bureau_id` int(11) UNSIGNED NOT NULL COMMENT 'ลำดับ',
  `citizen_id` varchar(13) DEFAULT NULL COMMENT 'เลขประจำตัว',
  `lname` varchar(50) DEFAULT NULL COMMENT 'ชื่อ',
  `fname` varchar(50) DEFAULT NULL COMMENT 'นามสกุล',
  `birthdate` date DEFAULT NULL COMMENT 'วันเดือนปีเกิด',
  `nationality` varchar(10) DEFAULT NULL COMMENT 'สัญชาติ',
  `sex` varchar(10) DEFAULT NULL COMMENT 'เพศ',
  `marital_status` varchar(10) DEFAULT NULL COMMENT 'สถานะสมรส',
  `address` varchar(150) DEFAULT NULL COMMENT 'ที่อยู่',
  `total_ac` int(2) DEFAULT NULL COMMENT 'บัญชีรวมทั้งสิ้น',
  `ac_excrcise` int(2) DEFAULT NULL COMMENT 'จำนวนบัญชีที่ใช้สิทธิ',
  `ac_status` varchar(10) DEFAULT NULL COMMENT 'สถานะบัญชี',
  `created` timestamp NULL DEFAULT NULL COMMENT 'วันที่สร้าง',
  `createdby` varchar(50) DEFAULT NULL COMMENT 'ผู้สร้าง',
  `updated` timestamp NULL DEFAULT NULL COMMENT 'วันที่แก้ไข',
  `updateby` varchar(50) DEFAULT NULL COMMENT 'ผู้แก้ไข'
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

-- --------------------------------------------------------

--
-- Table structure for table `tbl_lov`
--

CREATE TABLE `tbl_lov` (
  `lovId` int(11) NOT NULL,
  `type` varchar(50) DEFAULT NULL,
  `name` varchar(50) DEFAULT NULL,
  `display` varchar(100) DEFAULT NULL,
  `value` varchar(100) DEFAULT NULL,
  `value1` varchar(100) DEFAULT NULL,
  `value2` varchar(100) DEFAULT NULL,
  `value3` varchar(100) DEFAULT NULL,
  `value4` varchar(100) DEFAULT NULL,
  `value5` varchar(100) DEFAULT NULL,
  `value6` varchar(100) DEFAULT NULL,
  `value7` varchar(100) DEFAULT NULL,
  `value8` varchar(100) DEFAULT NULL,
  `value9` varchar(100) DEFAULT NULL,
  `value10` varchar(100) DEFAULT NULL,
  `created` timestamp NULL DEFAULT NULL,
  `createBy` varchar(50) DEFAULT NULL,
  `updated` timestamp NULL DEFAULT NULL,
  `updateBy` varchar(50) DEFAULT NULL,
  `status` varchar(10) DEFAULT NULL,
  `seqNo` int(11) DEFAULT '0'
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Dumping data for table `tbl_lov`
--

INSERT INTO `tbl_lov` (`lovId`, `type`, `name`, `display`, `value`, `value1`, `value2`, `value3`, `value4`, `value5`, `value6`, `value7`, `value8`, `value9`, `value10`, `created`, `createBy`, `updated`, `updateBy`, `status`, `seqNo`) VALUES
(1, 'titletype', NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, NULL, 0);

-- --------------------------------------------------------

--
-- Table structure for table `tbl_main_menu`
--

CREATE TABLE `tbl_main_menu` (
  `mainMenuId` int(11) NOT NULL,
  `menuName` varchar(100) NOT NULL DEFAULT '',
  `action` varchar(100) DEFAULT NULL,
  `groupMenu` varchar(1) DEFAULT '1' COMMENT '1 = 1 menu, 2 = groupmenu',
  `todoMethod` varchar(100) DEFAULT NULL,
  `onclick` varchar(100) DEFAULT NULL,
  `cssclass` varchar(100) DEFAULT NULL,
  `created` timestamp NULL DEFAULT NULL,
  `createBy` varchar(50) DEFAULT NULL,
  `updated` timestamp NULL DEFAULT NULL,
  `updateBy` varchar(50) DEFAULT NULL,
  `seqNo` int(11) DEFAULT '0',
  `levelMenu` varchar(1) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Dumping data for table `tbl_main_menu`
--

INSERT INTO `tbl_main_menu` (`mainMenuId`, `menuName`, `action`, `groupMenu`, `todoMethod`, `onclick`, `cssclass`, `created`, `createBy`, `updated`, `updateBy`, `seqNo`, `levelMenu`) VALUES
(1, 'ตั้งค่า', '', '2', '', NULL, 'dropdown', '2016-06-12 15:54:18', 'BrassZero', '2016-06-12 15:54:18', 'BeebyThailand', 5, '2'),
(2, 'หน้าแรก', 'PageAction.do', '1', 'gotoPageHome', NULL, 'active treeview', '2016-06-12 15:54:18', 'BeebyThailand', '2016-06-12 15:54:18', 'BeebyThailand', 1, '1'),
(3, 'สมัครสมาชิก', 'PageAction.do', '1', 'gotoPageRegister', NULL, 'active treeview', '2016-06-12 15:54:18', 'BeebyThailand', '2016-06-12 15:54:18', 'BeebyThailand', 2, '1'),
(4, 'เข้าสู่ระบบ', 'PageAction.do', '1', 'gotoPageLogin', NULL, 'active treeview', '2016-06-12 15:54:18', 'BeebyThailand', '2016-06-12 15:54:18', 'BeebyThailand', 4, '1'),
(7, 'เกี่ยวกับเรา', '#', '1', 'gotoPageBootstrapForm', NULL, 'active treeview', '2016-06-12 15:54:18', 'BeebyThailand', '2016-06-12 15:54:18', 'BeebyThailand', 5, '1'),
(10, 'ขอสินเชื่อ', 'PageAction.do', '1', 'gotoPageDetleRequest', NULL, 'active treeview', '2016-11-22 06:40:32', 'BrassZero', '2016-11-22 06:40:32', 'BrassZero', 3, '1'),
(11, 'ขอสินเชื่อ', 'PageAction.do', '1', 'gotoPageLoanRequest', NULL, 'active treeview', '2016-11-22 06:40:32', 'BrassZero', '2016-11-22 06:40:32', 'BrassZero', 3, '2'),
(12, 'จัดการสินเชื่อ', 'PageAction.do', '2', 'gotoPageManagermentLoan', NULL, 'dropdown', '2016-11-22 06:40:32', 'BrassZero', '2016-11-22 06:40:32', 'BrassZero', 1, '2'),
(13, 'จัดการผู้ใช้', 'PageAction.do', '1', 'gotoPageAdminManagermentProfile', NULL, 'active treeview', '2016-11-22 06:40:32', 'BrassZero', '2016-11-22 06:40:32', 'BrassZero', 2, '2'),
(15, 'ตรวจสอบการอนุมัติ', 'ApproveLoanAction.do', '1', 'gotoPageUserViewStatus', NULL, 'active treeview', NULL, NULL, NULL, NULL, 3, '2'),
(16, 'เงื่อนไขการขอกู้', '#', '1', NULL, NULL, 'active treeview', NULL, NULL, NULL, NULL, 7, '1');

-- --------------------------------------------------------

--
-- Table structure for table `tbl_requestloan`
--

CREATE TABLE `tbl_requestloan` (
  `loanreq_id` int(11) UNSIGNED NOT NULL COMMENT 'รหัสสินเชื่อ',
  `citizen_id` varchar(13) DEFAULT NULL COMMENT 'เลขบัตรประชาชน',
  `title_type` varchar(10) DEFAULT NULL COMMENT 'คำนำหน้า',
  `firstname` varchar(50) DEFAULT NULL COMMENT 'ชื่อ',
  `lastname` varchar(50) DEFAULT NULL COMMENT 'นามสกุล',
  `birthdate` varchar(10) DEFAULT NULL,
  `age` int(2) DEFAULT NULL,
  `nationality` varchar(50) DEFAULT NULL,
  `statustype` varchar(10) DEFAULT NULL COMMENT 'สถานะ',
  `mobile` varchar(10) DEFAULT NULL COMMENT 'เบอร์โทรศัพท์',
  `email` varchar(50) DEFAULT NULL COMMENT 'อีเมล์',
  `addressregistration` varchar(250) DEFAULT NULL COMMENT 'ที่อยู่ปัจจุบัน',
  `addresscurrent` varchar(250) DEFAULT NULL COMMENT 'ที่อยู่ทะเบียนบ้าน',
  `addresssenddoc` varchar(250) DEFAULT NULL COMMENT 'ที่อยู่จัดส่งเอกสาร',
  `jobtype` varchar(100) DEFAULT NULL COMMENT 'อาชีพ',
  `hometype` varchar(100) DEFAULT NULL COMMENT 'ประเภทที่อยู่อาศัย',
  `tradingprice` double DEFAULT NULL COMMENT 'ราคาชื่อขาย',
  `creditloan` double DEFAULT NULL COMMENT 'วงเงินชินเชื่อที่ขอกู้',
  `lncome_per_month` int(2) DEFAULT NULL COMMENT 'ระยะเวลาที่ขอกู้',
  `periodloan` double DEFAULT NULL COMMENT 'รายได้ประจำต่อเดือน',
  `netprofit` double DEFAULT NULL COMMENT 'รายได้เสริมทั้งหมดเฉลี่ยต่อเดือน',
  `copyidcard` varchar(250) DEFAULT NULL COMMENT 'สำเนาบัตรประจำตัวประชาชน',
  `copylicenses` varchar(250) DEFAULT NULL COMMENT 'สำเนาใบอนุญาตประกอบวิชาชีพ (กรณีประกอบวิชาชีพเฉพาะ)',
  `copydocumenthome` varchar(250) DEFAULT '' COMMENT 'สำเนาทะเบียนบ้าน',
  `copymarriage` varchar(250) DEFAULT NULL COMMENT 'สำเนาทะเบียนสมรส/ใบหย่า',
  `copy_rename` varchar(250) DEFAULT NULL COMMENT 'ใบเปลี่ยนชื่อ-สกุล (ทุกใบ) ',
  `salary_slip` varchar(250) DEFAULT 'null' COMMENT 'สลิปเงินเดือน',
  `copy_bankaccount` varchar(250) DEFAULT 'null' COMMENT 'สำเนาบัญชีธนาคาร',
  `banktype` varchar(250) DEFAULT '' COMMENT 'ชื่อธนาคาร',
  `loanstatustype` varchar(50) DEFAULT NULL COMMENT 'สถานะขขอสินเชื่อ',
  `createby` varchar(100) DEFAULT NULL COMMENT 'ชื่อผู้สร้าง',
  `created` timestamp NULL DEFAULT NULL COMMENT 'วันที่สร้าง',
  `updateby` varchar(100) DEFAULT NULL COMMENT 'ชื่อผู้แก้ไข',
  `updated` timestamp NULL DEFAULT NULL COMMENT 'วันที่แก้ไข'
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Dumping data for table `tbl_requestloan`
--

INSERT INTO `tbl_requestloan` (`loanreq_id`, `citizen_id`, `title_type`, `firstname`, `lastname`, `birthdate`, `age`, `nationality`, `statustype`, `mobile`, `email`, `addressregistration`, `addresscurrent`, `addresssenddoc`, `jobtype`, `hometype`, `tradingprice`, `creditloan`, `lncome_per_month`, `periodloan`, `netprofit`, `copyidcard`, `copylicenses`, `copydocumenthome`, `copymarriage`, `copy_rename`, `salary_slip`, `copy_bankaccount`, `banktype`, `loanstatustype`, `createby`, `created`, `updateby`, `updated`) VALUES
(22, '1409800246487', 'นาย', 'สุเมธ', 'แก่นแก้ว', '2016-11-10', 22, '', 'หย่าหร้าง', '083333333', 'sumet@hotmail.com', 'มหาสารคาม', ' มหาสารคาม', ' มหาสารคาม', '', '', 0, 0, 0, 0, 0, 'nofile', 'nofile', 'nofile', 'nofile', 'nofile', 'nofile', 'nofile', 'null|null|null|null|null|null|null|null', 'รออนุมัติ', 'สุเมธ', '2016-12-06 13:58:19', 'สุเมธ', '2016-12-06 13:58:19'),
(23, '1409800246487', 'นาย', 'สุเมธ', 'แก่นแก้ว', '2016-11-10', 22, '', 'หย่าหร้าง', '083333333', 'sumet@hotmail.com', 'มหาสารคาม', ' มหาสารคาม', ' มหาสารคาม', '', '', 0, 0, 0, 0, 0, 'nofile', 'nofile', 'nofile', 'nofile', 'nofile', 'nofile', 'nofile', 'null|null|null|null|null|null|null|null', 'ไม่อนุมัติ', 'สุเมธ', '2016-12-06 14:01:27', 'สุเมธ', '2016-12-06 14:01:27'),
(24, '1409800246487', 'นาย', 'สุเมธ', 'แก่นแก้ว', '2016-11-10', 22, '', 'หย่าหร้าง', '083333333', 'sumet@hotmail.com', 'มหาสารคาม', ' มหาสารคาม', ' มหาสารคาม', '', '', 0, 0, 0, 0, 0, 'nofile', 'nofile', 'nofile', 'nofile', 'nofile', 'nofile', 'nofile', 'null|null|null|null|null|null|null|null', 'อนุมัติ', 'สุเมธ', '2016-12-06 14:18:24', 'สุเมธ', '2016-12-06 14:18:24'),
(33, '1409800246487', 'นาย', 'สุเมธ', 'แก่นแก้ว', '2016-11-10', 22, 'ไทย', 'หย่าหร้าง', '083333333', 'sumet@hotmail.com', 'มหาสารคาม', ' มหาสารคาม', ' มหาสารคาม', NULL, 'สินเชื่อบ้านเดี่ยว', 11111111.44, 1000000.5, 10, 500000, 600000, 'a.png', 'b.png', 'c.jpeg', 'd.png', 'e.png', 'images.jpeg', 'uu.jpg', 'กรุงเทพ|กรุงไทย|ธนชาติ|ทหารไทย|null|กรุงศรีอยุธยา|ออมสิน|null', 'อนุมัติ', 'สุเมธ', '2016-12-10 17:10:54', 'สุเมธ', '2016-12-10 17:10:54'),
(35, '1409800246487', 'นาย', 'สุเมธ', 'แก่นแก้ว', '2016-11-10', 22, 'ไทย', 'หย่าหร้าง', '083333333', 'sumet@hotmail.com', 'มหาสารคาม', ' มหาสารคาม', ' มหาสารคาม', NULL, 'สินเชื่อบ้านเดี่ยว', 11111111.44, 1000000.5, 10, 500000, 600000, 'a.png', 'b.png', 'c.jpeg', 'd.png', 'e.png', 'images.jpeg', 'uu.jpg', 'กรุงเทพ|กรุงไทย|ธนชาติ|ทหารไทย|null|กรุงศรีอยุธยา|ออมสิน|null', 'รออนุมัติ', 'สุเมธ', '2016-12-10 17:10:54', 'Admin', '2016-12-14 12:09:50'),
(36, '1409800246487', 'นาย', 'สุเมธ', 'แก่นแก้ว', '2016-11-10', 22, 'ไทย', 'หย่าหร้าง', '083333333', 'sumet@hotmail.com', 'มหาสารคาม', ' มหาสารคาม', ' มหาสารคาม', NULL, 'สินเชื่อบ้านเดี่ยว', 11111111.44, 1000000.5, 10, 500000, 600000, 'a.png', 'b.png', 'c.jpeg', 'd.png', 'e.png', 'images.jpeg', 'uu.jpg', 'กรุงเทพ|กรุงไทย|ธนชาติ|ทหารไทย|null|กรุงศรีอยุธยา|ออมสิน|null', 'รออนุมัติ', 'สุเมธ', '2016-12-10 17:10:54', 'Admin', '2016-12-14 12:10:38'),
(37, '1409800246487', 'นาย', 'สุเมธ', 'แก่นแก้ว', '2016-11-10', 22, 'ไทย', 'หย่าหร้าง', '083333333', 'sumet@hotmail.com', 'มหาสารคาม', ' มหาสารคาม', ' มหาสารคาม', NULL, 'สินเชื่อบ้านเดี่ยว', 11111111.44, 1000000.5, 10, 500000, 600000, 'a.png', 'b.png', 'c.jpeg', 'd.png', 'e.png', 'images.jpeg', 'uu.jpg', 'กรุงเทพ|กรุงไทย|ธนชาติ|ทหารไทย|null|กรุงศรีอยุธยา|ออมสิน|null', 'รออนุมัติ', 'สุเมธ', '2016-12-10 17:10:54', 'Admin', '2016-12-14 12:29:06'),
(38, '1409800246487', 'นาย', 'สุเมธ', 'แก่นแก้ว', '2016-11-10', 22, 'ไทย', 'หย่าหร้าง', '083333333', 'sumet@hotmail.com', 'มหาสารคาม', ' มหาสารคาม', ' มหาสารคาม', NULL, 'สินเชื่อบ้านเดี่ยว', 11111111.44, 1000000.5, 10, 500000, 600000, 'c', 'fileedit', 'fileedit', 'fileedit', 'e.png', 'images.jpeg', 'uu.jpg', 'กรุงเทพ|กรุงไทย|ธนชาติ|ทหารไทย|null|กรุงศรีอยุธยา|ออมสิน|null', 'เอกสารไม่ผ่าน', 'สุเมธ', '2016-12-10 17:10:54', 'สุเมธ', '2016-12-10 17:10:54'),
(39, '1409800246487', 'นาย', 'สุเมธ', 'แก่นแก้ว', '2016-11-10', 22, 'ไทย', 'หย่าหร้าง', '083333333', 'sumet@hotmail.com', 'มหาสารคาม', ' มหาสารคาม', ' มหาสารคาม', NULL, 'สินเชื่อบ้านเดี่ยว', 11111111.44, 1000000.5, 10, 500000, 600000, '34.jpg', '34.jpg', 'ก', 'fd', 'df', '3sd', 'sd', 'กรุงเทพ|กรุงไทย|ธนชาติ|ทหารไทย|null|กรุงศรีอยุธยา|ออมสิน|null', 'รออนุมัติ', 'สุเมธ', '2016-12-10 17:10:54', 'สุเมธ', '2016-12-10 17:10:54'),
(40, '1409800246487', 'นาย', 'สุเมธ', 'แก่นแก้ว', '2016-11-10', 22, 'ไทย', 'หย่าหร้าง', '083333333', 'sumet@hotmail.com', 'มหาสารคาม', ' มหาสารคาม', ' มหาสารคาม', NULL, 'สินเชื่อบ้านเดี่ยว', 11111111.44, 1000000.5, 10, 500000, 600000, 'fileedit', 'fileedit', 'fileedit', 'a', 'a', 'a', 'fileedit', 'กรุงเทพ|กรุงไทย|ธนชาติ|ทหารไทย|null|กรุงศรีอยุธยา|ออมสิน|null', 'เอกสารไม่ผ่าน', 'สุเมธ', '2016-12-10 17:10:54', 'สุเมธ', '2016-12-10 17:10:54'),
(41, '1409800246487', 'นาย', 'สุเมธ', 'แก่นแก้ว', '2016-11-10', 22, 'ไทย', 'หย่าหร้าง', '083333333', 'sumet@hotmail.com', 'มหาสารคาม', ' มหาสารคาม', ' มหาสารคาม', NULL, 'สินเชื่อบ้านเดี่ยว', 11111111.44, 1000000.5, 10, 500000, 600000, 'fileedit', 'fileedit', 'fileedit', 'd.png', 'e.png', 'images.jpeg', 'fileedit', 'กรุงเทพ|กรุงไทย|ธนชาติ|ทหารไทย|null|กรุงศรีอยุธยา|ออมสิน|null', 'เอกสารไม่ผ่าน', 'สุเมธ', '2016-12-10 17:10:54', 'สุเมธ', '2016-12-10 17:10:54'),
(42, '1409800246487', 'นาย', 'สุเมธ', 'แก่นแก้ว', '2016-11-10', 22, 'ไทย', 'หย่าหร้าง', '083333333', 'sumet@hotmail.com', 'มหาสารคาม', ' มหาสารคาม', ' มหาสารคาม', NULL, 'สินเชื่อบ้านเดี่ยว', 11111111.44, 1000000.5, 10, 500000, 600000, 'fileedit', 'b.png', 'c.jpeg', 'd.png', 'e.png', 'images.jpeg', 'uu.jpg', 'กรุงเทพ|กรุงไทย|ธนชาติ|ทหารไทย|null|กรุงศรีอยุธยา|ออมสิน|null', 'เอกสารไม่ผ่าน', 'สุเมธ', '2016-12-10 17:10:54', 'สุเมธ', '2016-12-10 17:10:54'),
(43, '1409800246487', 'นาย', 'สุเมธ', 'แก่นแก้ว', '2016-11-10', 22, 'ไทย', 'หย่าหร้าง', '083333333', 'sumet@hotmail.com', 'มหาสารคาม', ' มหาสารคาม', ' มหาสารคาม', NULL, 'สินเชื่อบ้านเดี่ยว', 11111111.44, 1000000.5, 10, 500000, 600000, 'a.png', 'b.png', 'c.jpeg', 'd.png', 'e.png', 'images.jpeg', 'uu.jpg', 'กรุงเทพ|กรุงไทย|ธนชาติ|ทหารไทย|null|กรุงศรีอยุธยา|ออมสิน|null', 'รออนุมัติ', 'สุเมธ', '2016-12-10 17:10:54', 'Admin', '2016-12-14 19:05:54'),
(64, '1409800246487', 'นาย', 'สุเมธ', 'แก่นแก้ว', '2016-11-10', 22, 'ไทย', 'หย่าหร้าง', '083333333', 'sumet@hotmail.com', 'มหาสารคาม', ' มหาสารคาม', ' มหาสารคาม', NULL, 'สินเชื่อบ้านเดี่ยว', 11111111.44, 1000000.5, 10, 500000, 600000, 'a.png', 'b.png', 'c.jpeg', 'd.png', 'e.png', 'images.jpeg', 'uu.jpg', 'กรุงเทพ|กรุงไทย|ธนชาติ|ทหารไทย|null|กรุงศรีอยุธยา|ออมสิน|null', 'อนุมัติ', 'สุเมธ', '2016-12-10 17:10:54', 'สุเมธ', '2016-12-10 17:10:54'),
(65, '1409800246487', 'นาย', 'สุเมธ', 'แก่นแก้ว', '2016-11-10', 22, 'ไทย', 'หย่าหร้าง', '083333333', 'sumet@hotmail.com', 'มหาสารคาม', ' มหาสารคาม', ' มหาสารคาม', NULL, 'สินเชื่อบ้านเดี่ยว', 11111111.44, 1000000.5, 10, 500000, 600000, 'a.png', 'b.png', 'c.jpeg', 'd.png', 'e.png', 'images.jpeg', 'uu.jpg', 'กรุงเทพ|กรุงไทย|ธนชาติ|ทหารไทย|null|กรุงศรีอยุธยา|ออมสิน|null', 'อนุมัติ', 'สุเมธ', '2016-12-10 17:10:54', 'สุเมธ', '2016-12-10 17:10:54'),
(66, '1409800246487', 'นาย', 'สุเมธ', 'แก่นแก้ว', '2016-11-10', 22, 'ไทย', 'หย่าหร้าง', '083333333', 'sumet@hotmail.com', 'มหาสารคาม', ' มหาสารคาม', ' มหาสารคาม', NULL, 'สินเชื่อบ้านเดี่ยว', 11111111.44, 1000000.5, 10, 500000, 600000, 'a.png', 'b.png', 'c.jpeg', 'd.png', 'e.png', 'images.jpeg', 'uu.jpg', 'กรุงเทพ|กรุงไทย|ธนชาติ|ทหารไทย|null|กรุงศรีอยุธยา|ออมสิน|null', 'อนุมัติ', 'สุเมธ', '2016-12-10 17:10:54', 'สุเมธ', '2016-12-10 17:10:54'),
(67, '1409800246487', 'นาย', 'สุเมธ', 'แก่นแก้ว', '2016-11-10', 22, 'ไทย', 'หย่าหร้าง', '083333333', 'sumet@hotmail.com', 'มหาสารคาม', ' มหาสารคาม', ' มหาสารคาม', NULL, 'สินเชื่อบ้านเดี่ยว', 11111111.44, 1000000.5, 10, 500000, 600000, 'a.png', 'b.png', 'c.jpeg', 'd.png', 'e.png', 'images.jpeg', 'uu.jpg', 'กรุงเทพ|กรุงไทย|ธนชาติ|ทหารไทย|null|กรุงศรีอยุธยา|ออมสิน|null', 'อนุมัติ', 'สุเมธ', '2016-12-10 17:10:54', 'สุเมธ', '2016-12-10 17:10:54'),
(68, '1409800246487', 'นาย', 'สุเมธ', 'แก่นแก้ว', '2016-11-10', 22, 'ไทย', 'หย่าหร้าง', '083333333', 'sumet@hotmail.com', 'มหาสารคาม', ' มหาสารคาม', ' มหาสารคาม', NULL, 'สินเชื่อบ้านเดี่ยว', 11111111.44, 1000000.5, 10, 500000, 600000, 'a.png', 'b.png', 'c.jpeg', 'd.png', 'e.png', 'images.jpeg', 'uu.jpg', 'กรุงเทพ|กรุงไทย|ธนชาติ|ทหารไทย|null|กรุงศรีอยุธยา|ออมสิน|null', 'อนุมัติ', 'สุเมธ', '2016-12-10 17:10:54', 'สุเมธ', '2016-12-10 17:10:54'),
(69, '1409800246487', 'นาย', 'สุเมธ', 'แก่นแก้ว', '2016-11-10', 22, 'ไทย', 'หย่าหร้าง', '083333333', 'sumet@hotmail.com', 'มหาสารคาม', ' มหาสารคาม', ' มหาสารคาม', NULL, 'สินเชื่อบ้านเดี่ยว', 11111111.44, 1000000.5, 10, 500000, 600000, 'a.png', 'b.png', 'c.jpeg', 'd.png', 'e.png', 'images.jpeg', 'uu.jpg', 'กรุงเทพ|กรุงไทย|ธนชาติ|ทหารไทย|null|กรุงศรีอยุธยา|ออมสิน|null', 'อนุมัติ', 'สุเมธ', '2016-12-10 17:10:54', 'สุเมธ', '2016-12-10 17:10:54'),
(70, '1409800246487', 'นาย', 'สุเมธ', 'แก่นแก้ว', '2016-11-10', 22, 'ไทย', 'หย่าหร้าง', '083333333', 'sumet@hotmail.com', 'มหาสารคาม', ' มหาสารคาม', ' มหาสารคาม', NULL, 'สินเชื่อบ้านเดี่ยว', 11111111.44, 1000000.5, 10, 500000, 600000, 'a.png', 'b.png', 'c.jpeg', 'd.png', 'e.png', 'images.jpeg', 'uu.jpg', 'กรุงเทพ|กรุงไทย|ธนชาติ|ทหารไทย|null|กรุงศรีอยุธยา|ออมสิน|null', 'ไม่อนุมัติ', 'สุเมธ', '2016-12-10 17:10:54', 'สุเมธ', '2016-12-10 17:10:54'),
(84, '1409800246487', 'นาย', 'สุเมธ', 'แก่นแก้ว', '2016-11-10', 22, 'ไทย', 'หย่าหร้าง', '083333333', 'sumet@hotmail.com', 'มหาสารคาม', ' มหาสารคาม', ' มหาสารคาม', NULL, 'สินเชื่อบ้านเดี่ยว', 11111111.44, 1000000.5, 10, 500000, 600000, 'a.png', 'b.png', 'c.jpeg', 'd.png', 'e.png', 'images.jpeg', 'uu.jpg', 'กรุงเทพ|กรุงไทย|ธนชาติ|ทหารไทย|null|กรุงศรีอยุธยา|ออมสิน|null', 'ไม่อนุมัติ', 'สุเมธ', '2016-12-10 17:10:54', 'สุเมธ', '2016-12-10 17:10:54'),
(85, '1409800246487', 'นาย', 'สุเมธ', 'แก่นแก้ว', '2016-11-10', 22, 'ไทย', 'หย่าหร้าง', '083333333', 'sumet@hotmail.com', 'มหาสารคาม', ' มหาสารคาม', ' มหาสารคาม', NULL, 'สินเชื่อบ้านเดี่ยว', 11111111.44, 1000000.5, 10, 500000, 600000, 'a.png', 'b.png', 'c.jpeg', 'd.png', 'e.png', 'images.jpeg', 'uu.jpg', 'กรุงเทพ|กรุงไทย|ธนชาติ|ทหารไทย|null|กรุงศรีอยุธยา|ออมสิน|null', 'ไม่อนุมัติ', 'สุเมธ', '2016-12-10 17:10:54', 'สุเมธ', '2016-12-10 17:10:54'),
(86, '1409800246487', 'นาย', 'สุเมธ', 'แก่นแก้ว', '2016-11-10', 22, 'ไทย', 'หย่าหร้าง', '083333333', 'sumet@hotmail.com', 'มหาสารคาม', ' มหาสารคาม', ' มหาสารคาม', NULL, 'สินเชื่อบ้านเดี่ยว', 11111111.44, 1000000.5, 10, 500000, 600000, 'a.png', 'b.png', 'c.jpeg', 'd.png', 'e.png', 'images.jpeg', 'uu.jpg', 'กรุงเทพ|กรุงไทย|ธนชาติ|ทหารไทย|null|กรุงศรีอยุธยา|ออมสิน|null', 'เอกสารไม่ผ่าน', 'สุเมธ', '2016-12-10 17:10:54', 'สุเมธ', '2016-12-10 17:10:54'),
(102, '1409800246487', 'นาย', 'สุเมธ', 'แก่นแก้ว', '2016-11-10', 22, 'ไทย', 'หย่าหร้าง', '083333333', 'sumet@hotmail.com', 'มหาสารคาม', ' มหาสารคาม', ' มหาสารคาม', NULL, 'สินเชื่อบ้านเดี่ยว', 11111111.44, 1000000.5, 10, 500000, 600000, 'a.png', 'b.png', 'c.jpeg', 'd.png', 'e.png', 'images.jpeg', 'uu.jpg', 'กรุงเทพ|กรุงไทย|ธนชาติ|ทหารไทย|null|กรุงศรีอยุธยา|ออมสิน|null', 'เอกสารไม่ผ่าน', 'สุเมธ', '2016-12-10 17:10:54', 'สุเมธ', '2016-12-10 17:10:54'),
(103, '1409800246487', 'นาย', 'สุเมธ', 'แก่นแก้ว', '2016-11-10', 22, 'ไทย', 'หย่าหร้าง', '083333333', 'sumet@hotmail.com', 'มหาสารคาม', ' มหาสารคาม', ' มหาสารคาม', NULL, 'สินเชื่อบ้านเดี่ยว', 11111111.44, 1000000.5, 10, 500000, 600000, 'a.png', 'b.png', 'c.jpeg', 'd.png', 'e.png', 'images.jpeg', 'uu.jpg', 'กรุงเทพ|กรุงไทย|ธนชาติ|ทหารไทย|null|กรุงศรีอยุธยา|ออมสิน|null', 'เอกสารไม่ผ่าน', 'สุเมธ', '2016-12-10 17:10:54', 'สุเมธ', '2016-12-10 17:10:54'),
(104, '1409800246487', 'นาย', 'สุเมธ', 'แก่นแก้ว', '2016-11-10', 22, 'ไทย', 'หย่าหร้าง', '083333333', 'sumet@hotmail.com', 'มหาสารคาม', ' มหาสารคาม', ' มหาสารคาม', NULL, 'สินเชื่อบ้านเดี่ยว', 11111111.44, 1000000.5, 10, 500000, 600000, 'a.png', 'b.png', 'c.jpeg', 'd.png', 'e.png', 'images.jpeg', 'uu.jpg', 'กรุงเทพ|กรุงไทย|ธนชาติ|ทหารไทย|null|กรุงศรีอยุธยา|ออมสิน|null', 'รออนุมัติ', 'สุเมธ', '2016-12-10 17:10:54', 'สุเมธ', '2016-12-10 17:10:54'),
(105, '1409800246487', 'นาย', 'สุเมธ', 'แก่นแก้ว', '2016-11-10', 22, 'ไทย', 'หย่าหร้าง', '083333333', 'sumet@hotmail.com', 'มหาสารคาม', ' มหาสารคาม', ' มหาสารคาม', NULL, 'สินเชื่อบ้านเดี่ยว', 11111111.44, 1000000.5, 10, 500000, 600000, 'a.png', 'b.png', 'c.jpeg', 'd.png', 'e.png', 'images.jpeg', 'uu.jpg', 'กรุงเทพ|กรุงไทย|ธนชาติ|ทหารไทย|null|กรุงศรีอยุธยา|ออมสิน|null', 'รออนุมัติ', 'สุเมธ', '2016-12-10 17:10:54', 'สุเมธ', '2016-12-10 17:10:54'),
(106, '1409800246487', 'นาย', 'สุเมธ', 'แก่นแก้ว', '2016-11-10', 22, 'ไทย', 'หย่าหร้าง', '083333333', 'sumet@hotmail.com', 'มหาสารคาม', ' มหาสารคาม', ' มหาสารคาม', NULL, 'สินเชื่อบ้านเดี่ยว', 11111111.44, 1000000.5, 10, 500000, 600000, 'a.png', 'b.png', 'c.jpeg', 'd.png', 'e.png', 'images.jpeg', 'uu.jpg', 'กรุงเทพ|กรุงไทย|ธนชาติ|ทหารไทย|null|กรุงศรีอยุธยา|ออมสิน|null', 'รออนุมัติ', 'สุเมธ', '2016-12-10 17:10:54', 'สุเมธ', '2016-12-10 17:10:54'),
(107, '1409800246487', 'นาย', 'สุเมธ', 'แก่นแก้ว', '2016-11-10', 22, 'ไทย', 'หย่าหร้าง', '083333333', 'sumet@hotmail.com', 'มหาสารคาม', ' มหาสารคาม', ' มหาสารคาม', NULL, 'สินเชื่อบ้านเดี่ยว', 11111111.44, 1000000.5, 10, 500000, 600000, 'a.png', 'b.png', 'c.jpeg', 'd.png', 'e.png', 'images.jpeg', 'uu.jpg', 'กรุงเทพ|กรุงไทย|ธนชาติ|ทหารไทย|null|กรุงศรีอยุธยา|ออมสิน|null', 'รออนุมัติ', 'สุเมธ', '2016-12-10 17:10:54', 'สุเมธ', '2016-12-10 17:10:54'),
(108, '1409800246487', 'นาย', 'สุเมธ', 'แก่นแก้ว', '2016-11-10', 22, 'ไทย', 'หย่าหร้าง', '083333333', 'sumet@hotmail.com', 'มหาสารคาม', ' มหาสารคาม', ' มหาสารคาม', NULL, 'สินเชื่อบ้านเดี่ยว', 11111111.44, 1000000.5, 10, 500000, 600000, 'a.png', 'b.png', 'c.jpeg', 'd.png', 'e.png', 'images.jpeg', 'uu.jpg', 'กรุงเทพ|กรุงไทย|ธนชาติ|ทหารไทย|null|กรุงศรีอยุธยา|ออมสิน|null', 'รออนุมัติ', 'สุเมธ', '2016-12-10 17:10:54', 'สุเมธ', '2016-12-10 17:10:54'),
(109, '1409800246487', 'นาย', 'สุเมธ', 'แก่นแก้ว', '2016-11-10', 22, 'ไทย', 'หย่าหร้าง', '083333333', 'sumet@hotmail.com', 'มหาสารคาม', ' มหาสารคาม', ' มหาสารคาม', NULL, 'สินเชื่อบ้านเดี่ยว', 11111111.44, 1000000.5, 10, 500000, 600000, 'a.png', 'b.png', 'c.jpeg', 'd.png', 'e.png', 'images.jpeg', 'uu.jpg', 'กรุงเทพ|กรุงไทย|ธนชาติ|ทหารไทย|null|กรุงศรีอยุธยา|ออมสิน|null', 'รออนุมัติ', 'สุเมธ', '2016-12-10 17:10:54', 'สุเมธ', '2016-12-10 17:10:54'),
(110, '1409800246487', 'นาย', 'สุเมธ', 'แก่นแก้ว', '2016-11-10', 22, 'ไทย', 'หย่าหร้าง', '083333333', 'sumet@hotmail.com', 'มหาสารคาม', ' มหาสารคาม', ' มหาสารคาม', NULL, 'สินเชื่อบ้านเดี่ยว', 11111111.44, 1000000.5, 10, 500000, 600000, 'fileedit', 'fileedit', 'c.jpeg', 'd.png', 'e.png', 'images.jpeg', 'uu.jpg', 'กรุงเทพ|กรุงไทย|ธนชาติ|ทหารไทย|null|กรุงศรีอยุธยา|ออมสิน|null', 'เอกสารไม่ผ่าน', 'สุเมธ', '2016-12-10 17:10:54', 'สุเมธ', '2016-12-10 17:10:54'),
(114, '1409800246487', 'นาย', 'สุเมธ', 'แก่นแก้ว', '2016-11-10', 22, 'ไทย', 'หย่าหร้าง', '083333333', 'sumet@hotmail.com', 'มหาสารคาม', ' มหาสารคาม', ' มหาสารคาม', NULL, 'สินเชื่อบ้านเดี่ยว', 11111111.44, 1000000.5, 10, 500000, 600000, 'a.png', 'b.png', 'c.jpeg', 'd.png', 'e.png', 'images.jpeg', 'uu.jpg', 'กรุงเทพ|กรุงไทย|ธนชาติ|ทหารไทย|null|กรุงศรีอยุธยา|ออมสิน|null', 'รอตรวจสอบ', 'สุเมธ', '2016-12-10 17:10:54', 'สุเมธ', '2016-12-10 17:10:54'),
(125, '1409800246487', 'นาย', 'สุเมธ', 'แก่นแก้ว', '2016-11-10', 22, 'ไทย', 'หย่าหร้าง', '083333333', 'sumet@hotmail.com', 'มหาสารคาม', ' มหาสารคาม', ' มหาสารคาม', NULL, 'สินเชื่อบ้านเดี่ยว', 11111111.44, 1000000.5, 10, 500000, 600000, 'a.png', 'b.png', 'c.jpeg', 'd.png', 'e.png', 'images.jpeg', 'uu.jpg', 'กรุงเทพ|กรุงไทย|ธนชาติ|ทหารไทย|null|กรุงศรีอยุธยา|ออมสิน|null', 'รอตรวจสอบ', 'สุเมธ', '2016-12-10 17:10:54', 'สุเมธ', '2016-12-10 17:10:54'),
(128, '140980024', 'นางสาว', 'สุเมธsdsd', 'แก่นแก้วdf', '2016-11-10', 22, 'thai', 'หย่าหร้าง', '083333333', 'sumet@hotmail.com', 'มหาสารคามaaaasdfsd', ' sdมหาสารคามssss', ' มหาสารคามsss', 'programmer', 'สินเชื่อทาวน์เฮาส์', 9000000, 9000000, 10, 9000000, 9000000, '190-132-camera-ready.pdf', '190-132-camera-ready.pdf', '190-132-camera-ready.pdf', '190-132-camera-ready.pdf', '190-132-camera-ready.pdf', '190-132-camera-ready.pdf', '190-132-camera-ready.pdf', 'กรุงเทพ|กรุงไทย|ธนชาติ|ทหารไทย|ไทยพาณิชย์|null|ออมสิน|null', 'รออนุมัติ', 'สุเมธsdsd', '2016-12-14 11:48:29', 'Admin', '2016-12-17 16:30:35'),
(129, '140980024', 'นางสาว', 'สุเมธsdsd', 'แก่นแก้วdf', '2016-11-10', 22, 'thai', 'หย่าหร้าง', '083333333', 'sumet@hotmail.com', 'มหาสารคามaaaasdfsd', ' sdมหาสารคามssss', ' มหาสารคามsss', 'programmer', 'สินเชื่อทาวน์เฮาส์', 9000000, 9000000, 10, 9000000, 9000000, '190-132-camera-ready.pdf', '190-132-camera-ready.pdf', '190-132-camera-ready.pdf', '190-132-camera-ready.pdf', '190-132-camera-ready.pdf', '190-132-camera-ready.pdf', '190-132-camera-ready.pdf', 'กรุงเทพ|กรุงไทย|ธนชาติ|ทหารไทย|ไทยพาณิชย์|null|ออมสิน|null', 'รอตรวจสอบ', 'สุเมธsdsd', '2016-12-14 11:48:41', 'Admin', '2016-12-17 16:16:39'),
(134, '140980024', 'นาย', 'สุเมธ', 'แก่นแก้ว', '2016-11-10', 22, '', 'โสด', '083333333', 'sumat68@hotmail.com', 'มหาสารคาม', ' มหาสารคาม', ' มหาสารคาม', '', '', 0, 0, 0, 0, 0, 'for 1.png', 'for 1.png', 'ไม่มีไฟล์', 'ไม่มีไฟล์', 'ไม่มีไฟล์', 'ไม่มีไฟล์', 'ไม่มีไฟล์', 'กรุงเทพ|กรุงไทย|ธนชาติ|ทหารไทย|ไทยพาณิชย์|กรุงศรีอยุธยา|ออมสิน|กสิกรไทย', 'รอตรวจสอบ', 'สุเมธ', '2016-12-16 07:22:24', 'สุเมธ', '2016-12-16 07:22:24'),
(135, '140980024', 'นาย', 'สุเมธ', 'แก่นแก้ว', '2016-11-10', 22, '', 'โสด', '083333333', 'sumat68@hotmail.com', 'มหาสารคาม', ' มหาสารคาม', ' มหาสารคาม', '', '', 0, 0, 0, 0, 0, 'fileedit', 'fileedit', 'fileedit', 'ไม่มีไฟล์', 'ไม่มีไฟล์', 'ไม่มีไฟล์', 'ไม่มีไฟล์', 'กรุงเทพ|กรุงไทย|ธนชาติ|ทหารไทย|ไทยพาณิชย์|กรุงศรีอยุธยา|ออมสิน|กสิกรไทย', 'เอกสารไม่ผ่าน', 'สุเมธ', '2016-12-16 07:24:10', 'สุเมธ', '2016-12-16 07:24:10'),
(136, '140980024', 'นาย', 'สุเมธ', 'แก่นแก้ว', '2016-11-10', 22, 'ไทย', 'โสด', '083333333', 'sumat68@hotmail.com', 'มหาสารคาม', ' มหาสารคาม', ' มหาสารคาม', 'programmer', 'สินเชื่อทาวน์เฮาส์', 0, 0, 0, 0, 0, 'fileedit', 'fileedit', 'fileedit', 'ไม่มีไฟล์', 'ไม่มีไฟล์', 'ไม่มีไฟล์', 'ไม่มีไฟล์', 'กรุงเทพ|กรุงไทย|ธนชาติ|ทหารไทย|ไทยพาณิชย์|กรุงศรีอยุธยา|ออมสิน|กสิกรไทย', 'เอกสารไม่ผ่าน', 'สุเมธ', '2016-12-16 07:28:41', 'สุเมธ', '2016-12-16 07:28:41');

-- --------------------------------------------------------

--
-- Table structure for table `tbl_role`
--

CREATE TABLE `tbl_role` (
  `roleId` int(11) NOT NULL,
  `roleName` varchar(100) NOT NULL DEFAULT '',
  `detail` varchar(255) DEFAULT NULL,
  `created` timestamp NULL DEFAULT NULL,
  `createBy` varchar(50) DEFAULT NULL,
  `updated` timestamp NULL DEFAULT NULL,
  `updateBy` varchar(50) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Dumping data for table `tbl_role`
--

INSERT INTO `tbl_role` (`roleId`, `roleName`, `detail`, `created`, `createBy`, `updated`, `updateBy`) VALUES
(1, 'Administration', 'ผู้ดูแลระบบ', '2016-06-12 15:54:18', 'BeebyThailand', '2016-06-12 15:54:18', 'BeebyThailand'),
(2, 'User', 'ผู้ใช้ทั่วไป', '2016-06-12 15:54:18', 'BeebyThailand', '2016-06-12 15:54:18', 'BeebyThailand');

-- --------------------------------------------------------

--
-- Table structure for table `tbl_role_group_menu`
--

CREATE TABLE `tbl_role_group_menu` (
  `roleId` int(11) NOT NULL DEFAULT '0',
  `mainMenuId` int(11) NOT NULL DEFAULT '0',
  `seqNo` int(11) DEFAULT '0'
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Dumping data for table `tbl_role_group_menu`
--

INSERT INTO `tbl_role_group_menu` (`roleId`, `mainMenuId`, `seqNo`) VALUES
(1, 1, 5),
(1, 2, 1),
(1, 7, 4),
(1, 12, 2),
(1, 13, 3),
(2, 1, 5),
(2, 2, 1),
(2, 7, 4),
(2, 11, 2),
(2, 15, 3);

-- --------------------------------------------------------

--
-- Table structure for table `tbl_sub_menu`
--

CREATE TABLE `tbl_sub_menu` (
  `subMenuId` int(11) NOT NULL,
  `mainMenuId` int(11) NOT NULL DEFAULT '0',
  `menuName` varchar(100) NOT NULL DEFAULT '',
  `action` varchar(100) DEFAULT NULL,
  `todoMethod` varchar(100) DEFAULT NULL,
  `onclick` varchar(100) DEFAULT NULL,
  `cssclass` varchar(100) DEFAULT NULL,
  `created` timestamp NULL DEFAULT NULL,
  `createBy` varchar(50) DEFAULT NULL,
  `updated` timestamp NULL DEFAULT NULL,
  `updateBy` varchar(50) DEFAULT NULL,
  `seqNo` int(11) DEFAULT '0'
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Dumping data for table `tbl_sub_menu`
--

INSERT INTO `tbl_sub_menu` (`subMenuId`, `mainMenuId`, `menuName`, `action`, `todoMethod`, `onclick`, `cssclass`, `created`, `createBy`, `updated`, `updateBy`, `seqNo`) VALUES
(1, 1, 'แก้ไขข้อมูลส่วนตัว', 'PageAction.do', 'gotoPageProfile', NULL, NULL, '2016-06-12 15:54:18', 'BeebyThailand', '2016-06-12 15:54:18', 'BeebyThailand', 1),
(2, 1, 'เปลียนระหัสผ่าน', 'ChahgewdAction.do', 'gotoPageChangePassword', NULL, NULL, '2016-06-12 15:54:18', 'BeebyThailand', '2016-06-12 15:54:18', 'BeebyThailand', 2),
(3, 1, 'ออกจากระบบ', 'AuthenAuthorizeAction.do', 'logout', NULL, NULL, '2016-06-12 15:54:18', 'BeebyThailand', '2016-06-12 15:54:18', 'BeebyThailand', 3),
(4, 12, 'สินเชื่อรออนุมัติ', 'PageAction.do', 'gotoPageManagermentR', NULL, NULL, NULL, NULL, NULL, NULL, 2),
(5, 12, 'สินเชื่อที่ผ่านการอนุมัติ', 'PageAction.do', 'gotoPageManagermentAp', NULL, NULL, NULL, NULL, NULL, NULL, 1),
(6, 12, 'รอตรวจสอบ', 'PageAction.do', 'gotoPageManagermentLoan', NULL, NULL, NULL, NULL, NULL, NULL, 3),
(7, 12, 'สินเชื่อไม่ผ่านการอนุมัติ', 'PageAction.do', 'gotoPageManagermentNo', NULL, NULL, NULL, NULL, NULL, NULL, 5),
(8, 12, 'แก้ไขเอกสาร', 'PageAction.do', 'gotoPageManagermentNofile', NULL, NULL, NULL, NULL, NULL, NULL, 4);

-- --------------------------------------------------------

--
-- Table structure for table `tbl_user`
--

CREATE TABLE `tbl_user` (
  `user_id` int(11) NOT NULL,
  `citizen_id` varchar(13) NOT NULL DEFAULT '' COMMENT 'เลขบัตรประจำตัวประชาชน',
  `username` varchar(50) NOT NULL DEFAULT '' COMMENT 'ชื่อเข้าสู่ระบบ',
  `password` varchar(50) DEFAULT '' COMMENT 'รหัสผ่าน',
  `title_type` varchar(20) DEFAULT NULL COMMENT 'ประเภทคำนำหน้า',
  `firstName` varchar(50) DEFAULT NULL COMMENT 'ชื่อ',
  `lastName` varchar(50) DEFAULT NULL COMMENT 'นามสกุล',
  `birthdate` varchar(20) DEFAULT NULL COMMENT 'วัดเดือนปีเกิด',
  `age` int(3) DEFAULT NULL COMMENT 'อายุ',
  `statustype` varchar(30) DEFAULT NULL COMMENT 'สถานะ',
  `mobile` varchar(10) DEFAULT NULL COMMENT 'เบอร์โทร',
  `email` varchar(100) DEFAULT NULL COMMENT 'อีเมล์',
  `addressregistration` varchar(250) DEFAULT NULL COMMENT 'ที่อยู่ตามทะเบียนบ้าน',
  `addresscurrent` varchar(250) DEFAULT NULL COMMENT 'ที่อยู่ปัจจุบัน',
  `addresssenddoc` varchar(250) DEFAULT NULL COMMENT 'ที่อยู่จัดส่งเอกสาร',
  `roleId` int(11) NOT NULL DEFAULT '0' COMMENT 'รหัสสิทธิ',
  `created` timestamp NULL DEFAULT NULL COMMENT 'วันที่สร้าง',
  `createBy` varchar(50) DEFAULT NULL COMMENT 'ชื่อผู้สร้าง',
  `updated` timestamp NULL DEFAULT NULL COMMENT 'วันที่แก้ไข',
  `updateBy` varchar(50) DEFAULT NULL COMMENT 'ชื่อผู้แก้ไข',
  `status` varchar(1) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

--
-- Dumping data for table `tbl_user`
--

INSERT INTO `tbl_user` (`user_id`, `citizen_id`, `username`, `password`, `title_type`, `firstName`, `lastName`, `birthdate`, `age`, `statustype`, `mobile`, `email`, `addressregistration`, `addresscurrent`, `addresssenddoc`, `roleId`, `created`, `createBy`, `updated`, `updateBy`, `status`) VALUES
(105, '1111', '', '', ':: เลือก ::', '', '', '', 0, ':: เลือก ::', '', '', '', '', '', 2, '2016-12-14 04:22:55', '', '2016-12-14 04:22:55', '', '1'),
(60, '1111111111111', 'admin', 'admin', 'นาย', 'สุเมธ', 'แก่นแก้ว', '1994-03-10', 22, 'โสด', '0833412924', 'sumet68@hotmail.com', 'หนองสองห้อง\r\nขอนแก่น', 'หนองสองห้อง\r\nขอนแก่น', 'หนองสองห้อง\r\nขอนแก่น', 1, '2016-06-12 15:54:18', 'สุเมธ', '2016-06-12 15:54:18', 'สุเมธ', '1'),
(58, '1321312391287', '', '', 'นางสาว', 'สุเมธ', 'แก่นแก้ว', '1994-03-10', 22, 'โสด', '0833412924', 'sumet68@hotmail.com', 'มหาสารคาม', 'มหาสารคาม', 'มหาสารคาม', 2, '2016-11-25 04:52:34', 'à¸«à¸à¸à¸«à¸à¸', '2016-11-30 05:25:02', 'สุเมธ', '1'),
(2, '140980024', 'sumet', '12345', 'นาย', 'สุเมธ', 'แก่นแก้ว', '2016-11-10', 22, 'โสด', '083333333', 'sumat68@hotmail.com', 'มหาสารคาม', 'มหาสารคาม', 'มหาสารคาม', 2, '2016-06-12 15:54:18', 'brasszero', '2016-12-15 12:04:49', 'สุเมธ', '1'),
(1, '1409800246422', 'sumet', '1234', 'นาย', 'สุเมธ', 'แก่นแก้ว', '2537-03-10', NULL, 'โสด', '0833412924', 'sumet68@hotmail.com', 'rmu', 'rmu', 'rmu', 1, '2016-06-12 15:54:18', 'brassziro', '2016-06-12 15:54:18', 'brassziro', '1'),
(59, '140980024644', 'user', 'user', 'นาย', 'สุเมธ', 'แก่นแก้ว', '1994-01-10', 22, 'โสด', '0833412924', 'sumet678@gmail.com', 'หนองสองห้อง\r\nขอนแก่น', 'หนองสองห้อง\r\nขอนแก่น', 'หนองสองห้อง\r\nขอนแก่น', 2, '2016-11-26 15:07:56', 'สุเมธ', '2016-11-26 15:07:56', 'สุเมธ', '1'),
(126, '67567', 'user', 'user', ':: เลือก ::', 'สุเมธ', 'แก่นแก้ว', '10/03/2537', 22, 'โสด', '0833412924', 'sumat678@gmail.com', 'rmu', 'rmu', 'rmu', 2, '2016-12-18 11:53:12', 'สุเมธ', '2016-12-18 11:53:12', 'สุเมธ', '1');

--
-- Indexes for dumped tables
--

--
-- Indexes for table `tbl_admin`
--
ALTER TABLE `tbl_admin`
  ADD PRIMARY KEY (`userId`);

--
-- Indexes for table `tbl_bank`
--
ALTER TABLE `tbl_bank`
  ADD PRIMARY KEY (`id`);

--
-- Indexes for table `tbl_bankrequest`
--
ALTER TABLE `tbl_bankrequest`
  ADD PRIMARY KEY (`loanbankreq_id`);

--
-- Indexes for table `tbl_bureau`
--
ALTER TABLE `tbl_bureau`
  ADD PRIMARY KEY (`bureau_id`);

--
-- Indexes for table `tbl_lov`
--
ALTER TABLE `tbl_lov`
  ADD PRIMARY KEY (`lovId`);

--
-- Indexes for table `tbl_main_menu`
--
ALTER TABLE `tbl_main_menu`
  ADD PRIMARY KEY (`mainMenuId`);

--
-- Indexes for table `tbl_requestloan`
--
ALTER TABLE `tbl_requestloan`
  ADD PRIMARY KEY (`loanreq_id`);

--
-- Indexes for table `tbl_role`
--
ALTER TABLE `tbl_role`
  ADD PRIMARY KEY (`roleId`);

--
-- Indexes for table `tbl_role_group_menu`
--
ALTER TABLE `tbl_role_group_menu`
  ADD PRIMARY KEY (`roleId`,`mainMenuId`);

--
-- Indexes for table `tbl_sub_menu`
--
ALTER TABLE `tbl_sub_menu`
  ADD PRIMARY KEY (`subMenuId`);

--
-- Indexes for table `tbl_user`
--
ALTER TABLE `tbl_user`
  ADD PRIMARY KEY (`citizen_id`),
  ADD KEY `userid` (`user_id`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `tbl_admin`
--
ALTER TABLE `tbl_admin`
  MODIFY `userId` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=3;
--
-- AUTO_INCREMENT for table `tbl_bank`
--
ALTER TABLE `tbl_bank`
  MODIFY `id` int(11) UNSIGNED NOT NULL AUTO_INCREMENT COMMENT 'ลำดับ', AUTO_INCREMENT=8;
--
-- AUTO_INCREMENT for table `tbl_bankrequest`
--
ALTER TABLE `tbl_bankrequest`
  MODIFY `loanbankreq_id` int(11) UNSIGNED NOT NULL AUTO_INCREMENT COMMENT 'รหัสธนาคาร';
--
-- AUTO_INCREMENT for table `tbl_bureau`
--
ALTER TABLE `tbl_bureau`
  MODIFY `bureau_id` int(11) UNSIGNED NOT NULL AUTO_INCREMENT COMMENT 'ลำดับ';
--
-- AUTO_INCREMENT for table `tbl_lov`
--
ALTER TABLE `tbl_lov`
  MODIFY `lovId` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=2;
--
-- AUTO_INCREMENT for table `tbl_main_menu`
--
ALTER TABLE `tbl_main_menu`
  MODIFY `mainMenuId` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=17;
--
-- AUTO_INCREMENT for table `tbl_requestloan`
--
ALTER TABLE `tbl_requestloan`
  MODIFY `loanreq_id` int(11) UNSIGNED NOT NULL AUTO_INCREMENT COMMENT 'รหัสสินเชื่อ', AUTO_INCREMENT=137;
--
-- AUTO_INCREMENT for table `tbl_role`
--
ALTER TABLE `tbl_role`
  MODIFY `roleId` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=3;
--
-- AUTO_INCREMENT for table `tbl_sub_menu`
--
ALTER TABLE `tbl_sub_menu`
  MODIFY `subMenuId` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=9;
--
-- AUTO_INCREMENT for table `tbl_user`
--
ALTER TABLE `tbl_user`
  MODIFY `user_id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=127;
