/*
 * package com.demo.utils;
 * 
 * import java.util.List; import java.util.function.Function;
 * 
 * import com.github.pagehelper.Page; import com.github.pagehelper.PageHelper;
 * 
 * public class PageUtil{
 * 
 * public static <T> Page<T> executePage(PageRequest<T> request, Function<T,
 * List<T>> fun){ return PageHelper.startPage(request.getPageNo(),
 * request.getPageSize(), request.getOrderBy()) .doSelectPage(() ->
 * fun.apply(request.getT())); } }
 */