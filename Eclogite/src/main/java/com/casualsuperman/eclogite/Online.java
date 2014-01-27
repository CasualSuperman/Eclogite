package com.casualsuperman.eclogite;

import android.content.Context;

import org.jsoup.Connection;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;

import java.util.Map;

/**
 * Created by rwertman on 11/14/13.
 */
public class Online {
    private static String baseURL = "http://m.fanfiction.net/";
    private static Online singleton = new Online();
    private Map<String,String> cookies;

    private Online() {}

    public Story Story(int id) {
        return singleton.Story(id);
    }

    public Online Login(String username, String password) {
        return new Online();
    }

    private class Story {
        private int storyID;

    }
}
