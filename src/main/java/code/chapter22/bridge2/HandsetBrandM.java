package code.chapter22.bridge2;

//手机品牌M
class HandsetBrandM extends HandsetBrand {

    //手机品牌N的通讯录
    static class HandsetBrandNAddressList extends HandsetBrandN {
        public void run() {
            System.out.println("运行N品牌手机通讯录");
        }
    }
}