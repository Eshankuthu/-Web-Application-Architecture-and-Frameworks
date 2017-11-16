package com.packt.webstore.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.packt.webstore.domain.Cart;
import com.packt.webstore.service.CartService;

/**
 * By annotating the controller class with @RestController annotation, you no
 * longer need to add @ResponseBody to all the request mapping methods.
 * 
 * @author rXing
 *
 */
@RestController
@RequestMapping("resta/cart")
public class CartRestController2 {

	@Autowired
	private CartService cartService;

	@RequestMapping(method = RequestMethod.POST)
	public Cart create(@RequestBody Cart cart) {
		System.out.println(cart);
		return cartService.create(cart);
	}

	@RequestMapping(value = "/{cartId}", method = RequestMethod.GET)
	public Cart read(@PathVariable(value = "cartId") String cartId) {
		return cartService.read(cartId);
	}
}
