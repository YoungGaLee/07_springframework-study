package com.inyong.di.service;

import org.springframework.stereotype.Service;

@Service("phoneService")
public class PhoneServiceImpl_Web implements PhoneService {

    @Override
    public void selectList() {
        System.out.println("웹용 폰 전체 목록 조회용 서비스 실행");
    }

    @Override
    public void selectDetail() {
        System.out.println("웹용 폰 상세 조회용 서비스 실행");
    }
}
