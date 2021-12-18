package learn.cms.fetch.message;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import org.bouncycastle.cms.CMSException;
import org.bouncycastle.cms.CMSSignedData;
import org.bouncycastle.util.encoders.Base64;

public class Util {

    public static void main(String[] args) throws IOException, CMSException {
        if (args.length == 1) {
            String cmsBase64 = new String(Files.readAllBytes(new File(args[0]).toPath()));
            CMSSignedData signedData = new CMSSignedData(Base64.decode(cmsBase64));
            byte[] message = (byte[]) signedData.getSignedContent().getContent();
            System.out.println(new String(message));
        }
    }
}
