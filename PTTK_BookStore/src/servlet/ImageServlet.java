
package servlet;

import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.io.OutputStream;
import javax.imageio.ImageIO;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class ImageServlet extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		response.setContentType("image/jpeg");
		String imgUrl = request.getParameter("url");
		String pathToWeb = getServletContext().getRealPath(File.separator);
		String fullImgUrl = pathToWeb + "/static/images/" + imgUrl;
		 System.out.println("img file: " + fullImgUrl);
//		File f = new File(fullImgUrl);
//		BufferedImage bi = ImageIO.read(f);
//		OutputStream out = response.getOutputStream();
//		ImageIO.write(bi, "jpg", out);
//		out.close();
	}
}
