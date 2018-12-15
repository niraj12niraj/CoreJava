package com.jlcindia.servlets;
import java.io.*;
import java.util.*;
import javax.servlet.annotation.MultipartConfig;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;
import javax.servlet.*;

@WebServlet(name="uploadServlet",urlPatterns={"/upload.jlc"})
@MultipartConfig(location="F:/uploaded",fileSizeThreshold=1024*1024*10,
		maxFileSize=1024*1024*50)
public class UploadServlet extends HttpServlet{

	private String headerName;

	protected void service(HttpServletRequest req,HttpServletResponse res)throws
	ServletException,IOException{
		Collection<Part>parts=req.getParts();
		for(Part part : parts){
			System.out.println("Name :"+part.getName());
			System.out.println("Header :");
			for(String headerName : part.getHeaderNames());{
			System.out.println(headerName +"\t\t"+part.getHeader(headerName));
			}
		
		String fileinfo=part.getHeader("content-disposition");
		String fnames[]=fileinfo.split("\"");
		String fname=fnames[fnames.length-1];
		
		System.out.println("Size :"+part.getSize());
		part.write(fname);
	}
	Writer out=res.getWriter();
	out.write("<h1>File uploaded to F:\\uploaded");

}}
