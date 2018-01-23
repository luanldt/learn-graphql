/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.hcosface.model;

import com.coxautodev.graphql.tools.GraphQLRootResolver;
import com.hcosface.entities.Link;
import com.hcosface.entities.LinkRepository;

/**
 *
 * @author luannm
 */
public class Mutation implements GraphQLRootResolver {
  private final LinkRepository linkRepository;

  public Mutation(LinkRepository linkRepository) {
      this.linkRepository = linkRepository;
  }

  public Link createLink(String url, String description) {
    Link newLink = new Link(url, description);
    linkRepository.saveLink(newLink);
    return newLink;
  }
}
