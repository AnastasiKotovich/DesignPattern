package Modul_five.Builder;

public class EnterpriceWebsite extends WebsiteBuilder{
    @Override
    void buildName() {
        website.setName("Enterprice website");
    }

    @Override
    void buildCms() {
        website.setCms(Cms.JOOMLA);
    }

    @Override
    void buildPrice() {
        website.setPrice(10000);
    }
}
