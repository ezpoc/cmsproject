package com.cms.cis.entity;

import lombok.Data;

@Data
public class Fragment {

    private String fragmentName;

    private String fragmentType;

    private String fragmentSize;

    private byte[] fragment;
}
