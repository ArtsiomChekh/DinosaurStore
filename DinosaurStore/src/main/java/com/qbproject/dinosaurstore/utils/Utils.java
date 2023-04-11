package com.qbproject.dinosaurstore.utils;

import com.qbproject.dinosaurstore.model.CartInfo;

import jakarta.servlet.http.HttpServletRequest;

public class Utils {

	// The products that are currently in the user's cart are stored in the session.
	public static CartInfo getCartInSession(HttpServletRequest request) {

		CartInfo cartInfo = (CartInfo) request.getSession().getAttribute("myCart");

		if (cartInfo == null) {
			cartInfo = new CartInfo();

			request.getSession().setAttribute("myCart", cartInfo);
		}

		return cartInfo;
	}

	public static void removeCartInSession(HttpServletRequest request) {
		request.getSession().removeAttribute("myCart");
	}

	public static void storeLastOrderedCartInSession(HttpServletRequest request, CartInfo cartInfo) {
		request.getSession().setAttribute("lastOrderedCart", cartInfo);
	}

	public static CartInfo getLastOrderedCartInSession(HttpServletRequest request) {
		return (CartInfo) request.getSession().getAttribute("lastOrderedCart");
	}

}
