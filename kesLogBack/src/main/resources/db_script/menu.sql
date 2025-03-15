CREATE TABLE IF NOT EXISTS `t_menu_setting` (
    `menu_code`				BIGINT(10)  UNSIGNED    NOT NULL AUTO_INCREMENT                                         COMMENT '메뉴 코드'
    , `parent_menu_code`	BIGINT(10)  UNSIGNED    	NULL 				                                        COMMENT '상위 메뉴 코드'
    , `create_dt`	        TIMESTAMP				NOT NULL DEFAULT CURRENT_TIMESTAMP								COMMENT '생성일시'
    , `modify_dt`	        TIMESTAMP				NOT NULL DEFAULT CURRENT_TIMESTAMP ON UPDATE CURRENT_TIMESTAMP	COMMENT '수정일시'
    , PRIMARY KEY	(`menu_code`)
    , KEY			(`parent_menu_code`)
) ENGINE=INNODB DEFAULT CHARSET=utf8mb4 COMMENT='메뉴 설정';
ALTER TABLE `t_menu_setting`   ADD COLUMN IF NOT EXISTS `menu_name`			VARCHAR(256)	NOT NULL    COMMENT '메뉴명'    AFTER `parent_menu_code`;