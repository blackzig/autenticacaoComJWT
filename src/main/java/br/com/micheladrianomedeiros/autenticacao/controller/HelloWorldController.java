/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.micheladrianomedeiros.autenticacao.controller;
//https://www.javainuse.com/spring/boot-jwt
//https://www.youtube.com/watch?v=p6MXb0GtXwg&list=LLmToHlgLIfzIBJERNNu1elg&index=9&t=0s

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldController {

    @RequestMapping({"/hello"})
    public String firstPage() {
        return "Hello World";
    }
}
