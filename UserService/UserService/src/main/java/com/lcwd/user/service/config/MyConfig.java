package com.lcwd.user.service.config;

import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;


@Configuration
public class MyConfig {


//    @Autowired
//    private  ClientRegistrationRepository clientRegistrationRepository;
//    @Autowired
//    private  OAuth2AuthorizedClientRepository oAuth2AuthorizedClientRepository;

    @Bean
    @LoadBalanced
    public RestTemplate restTemplate() {


        RestTemplate restTemplate = new RestTemplate();

//        List<ClientHttpRequestInterceptor> interceptors=new ArrayList<>();
//
//        interceptors.add(new RestTemplateInterceptor(manager(
//                clientRegistrationRepository,
//                oAuth2AuthorizedClientRepository
//        )));
//
//        restTemplate.setInterceptors(interceptors);


        return restTemplate;


    }

    //declare the bean of OAuth2AuthorizedClient manager

//    @Bean
//    public OAuth2AuthorizedClientManager manager(
//            ClientRegistrationRepository clientRegistrationRepository,
//            OAuth2AuthorizedClientRepository auth2AuthorizedClientRepository
//    ) {
//        OAuth2AuthorizedClientProvider provider = OAuth2AuthorizedClientProviderBuilder.builder().clientCredentials().build();
//        DefaultOAuth2AuthorizedClientManager defaultOAuth2AuthorizedClientManager = new DefaultOAuth2AuthorizedClientManager(clientRegistrationRepository, auth2AuthorizedClientRepository);
//        defaultOAuth2AuthorizedClientManager.setAuthorizedClientProvider(provider);
//        return defaultOAuth2AuthorizedClientManager;
//
//
//    }

}
