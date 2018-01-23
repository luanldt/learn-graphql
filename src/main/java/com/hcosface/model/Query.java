/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.hcosface.model;

import com.coxautodev.graphql.tools.GraphQLRootResolver;
import com.hcosface.entities.Link;
import com.hcosface.entities.LinkRepository;
import java.util.List;

/**
 *
 * @author luannm
 */
public class Query implements GraphQLRootResolver {
    
    private final LinkRepository linkRepository;

    public Query(LinkRepository linkRepository) {
        this.linkRepository = linkRepository;
    }

    public List<Link> allLinks() {
        return linkRepository.getAllLinks();
    }
}