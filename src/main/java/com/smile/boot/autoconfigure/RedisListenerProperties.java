package com.smile.boot.autoconfigure;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import org.springframework.boot.context.properties.ConfigurationProperties;

import java.util.List;

/**
 * @author yafei.liu
 * Create at 2021-02-02 00:09
 */
@Getter
@Setter
@ToString
@ConfigurationProperties(prefix = "smile.redis")
public class RedisListenerProperties {

    private List<String> topics;
}
