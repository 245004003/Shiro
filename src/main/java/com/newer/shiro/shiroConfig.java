package com.newer.shiro;

import org.apache.shiro.spring.web.config.DefaultShiroFilterChainDefinition;
import org.apache.shiro.spring.web.config.ShiroFilterChainDefinition;
import org.apache.shiro.web.mgt.DefaultWebSecurityManager;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * Create by 何辉
 * 2020/3/28 11:10
 */
@Configuration
public class shiroConfig {
    /**
     * 需要提供一个 Realm 的实例。
     * @return
     */
    @Bean
    Realm realm(){
        return new Realm();
    }

    /**
     * 需要配置一个 SecurityManager，在 SecurityManager 中配置 Realm。
     * @return
     */
    @Bean
    DefaultWebSecurityManager securityManager(){
        DefaultWebSecurityManager manager=new DefaultWebSecurityManager();
        manager.setRealm(realm());
        return manager;
    }

    /**
     * 配置一个 ShiroFilterFactoryBean ，在 ShiroFilterFactoryBean 中指定路径拦截规则等。
     * @return
     */
    @Bean
    ShiroFilterChainDefinition shiroFilterChainDefinition (){
        DefaultShiroFilterChainDefinition definition=new DefaultShiroFilterChainDefinition();
        System.out.println("权限管理");
        definition.addPathDefinition("/doLogin","anon");
        definition.addPathDefinition("/hello1","authc,roles[js:ls]");
        definition.addPathDefinition("/hello","authc,roles[]");
        return definition;
    }
}
