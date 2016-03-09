package maven;

import jmp.maven.StringUtils;

public class FackeServlet {

    public void doCustomGet(final String url) {

        StringUtils.concat(url, "?param=test");
    }
}
