package br.xksoberbado.gcloudfunction;

import com.google.cloud.functions.HttpFunction;
import com.google.cloud.functions.HttpRequest;
import com.google.cloud.functions.HttpResponse;

public class HttpFunctionExample implements HttpFunction {

    @Override
    public void service(final HttpRequest request,
                        final HttpResponse response) throws Exception {
        final var writer = response.getWriter();
        writer.write("This is a http function example!");
    }
}
