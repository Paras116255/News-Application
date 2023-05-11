package com.paras.myapplication;

import com.paras.myapplication.Models.NewsHeadlines;

import java.util.List;

public interface OnFetchDataListener<NewsApResponse> {
    void onFetchData(List<NewsHeadlines> list, String message);
    void onError(String message);
}
