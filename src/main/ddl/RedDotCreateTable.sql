-- 新建表格
CREATE TABLE `reddot_template` (
    `rt_id` bigint(20) NOT NULL AUTO_INCREMENT,
    `rt_table` varchar(255) DEFAULT '',
    `rt_status` int(3) DEFAULT '200',
    `rt_orderid` bigint(20) NOT NULL,
    PRIMARY KEY (`rt_id`),
    KEY `reddot_template_table_IDX` (`rt_table`),
    KEY `reddot_template_status_IDX` (`rt_status`),
    KEY `reddot_template_orderit_IDX` (`rt_orderid`)
)
