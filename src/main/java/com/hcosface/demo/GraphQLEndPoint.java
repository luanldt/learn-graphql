/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.hcosface.demo;

import com.coxautodev.graphql.tools.SchemaParser;
import com.hcosface.entities.LinkRepository;
import com.hcosface.model.Mutation;
import com.hcosface.model.Query;
import graphql.schema.GraphQLSchema;
import graphql.servlet.SimpleGraphQLServlet;
import javax.servlet.annotation.WebServlet;

/**
 *
 * @author luannm
 */
@WebServlet(urlPatterns = "/graphql")
public class GraphQLEndPoint extends SimpleGraphQLServlet {

  public GraphQLEndPoint() {
    super(buildSchema());
  }
  
  public static GraphQLSchema buildSchema() {
    LinkRepository linkRepository = new LinkRepository();
    return SchemaParser.newParser()
                .file("/schema.graphqls") //parse the schema file created earlier
                .resolvers(new Query(linkRepository), new Mutation(linkRepository))
                .build()
                .makeExecutableSchema();
  }
}
