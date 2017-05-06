DROP TABLE IF EXISTS `env`;
CREATE TABLE `env` (
  `id` SMALLINT UNSIGNED PRIMARY KEY NOT NULL AUTO_INCREMENT,
  `env` VARCHAR(16) NOT NULL COMMENT '环境',
  `host_inner_ip`  VARCHAR(32) NOT NULL COMMENT 'HOST 内网 IP',
  `host_outer_ip`  VARCHAR(32) NOT NULL DEFAULT ' ' COMMENT 'HOST 外网 IP',
  `mysql_inner_ip` VARCHAR(32) NOT NULL DEFAULT ' ' COMMENT 'MYSQL 内网 IP',
  `mysql_outer_ip` VARCHAR(32) NOT NULL COMMENT 'MYSQL 外网 IP',
  `mysql_port`     VARCHAR(16) NOT NULL COMMENT 'MYSQL PORT'
)DEFAULT CHARSET=utf8;

DROP TABLE IF EXISTS `host`;
CREATE TABLE IF NOT EXISTS `host` (
  `id`          BIGINT(20) UNSIGNED PRIMARY KEY AUTO_INCREMENT,
  `host`        VARCHAR(64) NOT NULL DEFAULT ' ' COMMENT 'request_host＋端口',
  `host_name`   VARCHAR(32) COMMENT '所属项目/端',
  `description` VARCHAR(2048) COMMENT '简述'
)DEFAULT CHARSET=utf8;

DROP TABLE IF EXISTS `uri`;
CREATE TABLE IF NOT EXISTS `uri` (
  `id`      BIGINT(20) UNSIGNED PRIMARY KEY AUTO_INCREMENT,
  `host_id` BIGINT(20) UNSIGNED NOT NULL DEFAULT ' ' COMMENT 'host id',
  `uri`     VARCHAR(128) NOT NULL DEFAULT ' ' COMMENT 'suffix',
  `project` VARCHAR(32)  NOT NULL DEFAULT ' ' COMMENT '归属项目'
)DEFAULT CHARSET=utf8;

DROP TABLE IF EXISTS `headers`;
CREATE TABLE IF NOT EXISTS `headers` (
  `id`            BIGINT(20) UNSIGNED PRIMARY KEY AUTO_INCREMENT,
  `host_id`       BIGINT(20) UNSIGNED NOT NULL DEFAULT ' ' COMMENT 'host id',
  `uri_id`        BIGINT(20) NOT NULL DEFAULT ' ' COMMENT 'uri id',
  `method`        VARCHAR(16) NOT NULL DEFAULT ' ' COMMENT '请求方法',
  `authorization` VARCHAR(32) COMMENT '存放staff id，针对CRM系统',
  `cookie`        VARCHAR(256) COMMENT 'cookie信息，WWW | H5 访问',
  `content_type`  VARCHAR(32) NOT NULL DEFAULT ' ' COMMENT 'application/json |text 等'
)DEFAULT CHARSET=utf8