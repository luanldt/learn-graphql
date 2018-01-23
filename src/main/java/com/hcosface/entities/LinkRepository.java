/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.hcosface.entities;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author luannm
 */
public class LinkRepository {
    
    private final List<Link> links;

    public LinkRepository() {
        links = new ArrayList<>();
        //add some links to start off with
        links.add(new Link("http://howtographql.com", "Your favorite GraphQL page"));
        links.add(new Link("http://graphql.org/learn/", "The official docks"));
        links.add(new Link("https://kallmail.hcosface.com", "The official kallmail of Hcosface"));
        links.add(new Link("http://luandeptrai.com", "The official website of Luan Dep Trai"));
        links.add(new Link("https://hcosface.com", "The official website of Hcosface"));
    }

    public List<Link> getAllLinks() {
        return links;
    }
    
    public void saveLink(Link link) {
        links.add(link);
    }
}