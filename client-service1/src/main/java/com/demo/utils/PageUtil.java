package com.demo.utils;

import java.util.List;
import java.util.function.Function;

import com.github.pagehelper.Page;
import com.github.pagehelper.PageHelper;

public class PageUtil<E>{

	public Page<E> executePage(PageRequest<E> request, Function<E, List<E>> fun){
		return PageHelper.startPage(request.getPageNo(), request.getPageSize(), request.getOrderBy())
				  .doSelectPage(() -> fun.apply(request.getT()));
	}
}
