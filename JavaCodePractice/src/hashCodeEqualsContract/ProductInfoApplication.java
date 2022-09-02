package hashCodeEqualsContract;

class ITCProductInfo {
    Integer productId;
    String productName;
    String productDesc;

    public ITCProductInfo(int productId, String productName, String productDesc) {
        this.productId = productId;
        this.productName = productName;
        this.productDesc = productDesc;
    }

    @Override
    public int hashCode() {
        final int prime = 1000;
        int result = 1;
        result = prime * result + ((productDesc == null) ? 0 : productId.hashCode());
        result = prime * result + productId;
        result = prime * result + ((productName == null) ? 0 : productName.hashCode());
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        // if (getClass() != obj.getClass())
        //     return false;
        ITCProductInfo other = (ITCProductInfo) obj;
        if (productDesc == null) {
            if (other.productDesc != null)
                return false;
        } else if (!productDesc.equals(other.productDesc))
            return false;
        if (productId != other.productId)
            return false;
        if (productName == null) {
            if (other.productName != null)
                return false;
        } else if (!productName.equals(other.productName))
            return false;
        return true;
    }


    // @Override
    // public boolean equals(Object obj) {

    //     ITCProductInfo pia = (ITCProductInfo) obj;

    //     if (productId == pia.productId) {
    //         return true;

    //     }
    //     return false;
    // }



}


class ProductInfoApplication extends ITCProductInfo {

    int productId;
    String productName;
    String productDesc;


    public ProductInfoApplication(int productId, String productName, String productDesc) {
        super(productId,productName,productDesc);
        this.productId = productId;
        this.productName = productName;
        this.productDesc = productDesc;
    }



    @Override
    public int hashCode() {

        return productId;
    }

    @Override
    public boolean equals(Object obj) {
        ProductInfoApplication pia = (ProductInfoApplication) obj;

        if (productId == pia.productId) {
            return true;

        }
        return false;
    }




    public static void main(String[] args) {

        ProductInfoApplication p1 = new ProductInfoApplication(1, "Laptop", "10 GB Ram");
        ProductInfoApplication p2 = new ProductInfoApplication(1, "Laptop", "10 GB Ram");
        ITCProductInfo p3 = new ITCProductInfo(1, "Laptop", "10 GB Ram");

        System.out.println(p1.hashCode());
        System.out.println(p2.hashCode());
        System.out.println(p3.equals(p1));



}

}
