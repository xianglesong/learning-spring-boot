CREATE TABLE `user_info` (
  `id` char(32) NOT NULL,
  `user_name` varchar(45) DEFAULT NULL,
  `user_pwd` varchar(45) DEFAULT NULL,
  `update_time` datetime DEFAULT NULL,
  `insert_time` datetime DEFAULT NULL,
  `status` int(11) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
