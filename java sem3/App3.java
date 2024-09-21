import java.util.Scanner;

class Asset {
    private String assetsName;
    private String assetsId;
    private String assetsType;
    private double assetsPrice;
    private double assetsDiscount;
    private int assetsQuantity;

    public Asset(String assetsName, String assetsId, String assetsType, double assetsPrice, double assetsDiscount,
            int assetsQuantity) {
        this.assetsName = assetsName;
        this.assetsId = assetsId;
        this.assetsType = assetsType;
        this.assetsPrice = assetsPrice;
        this.assetsDiscount = assetsDiscount;
        this.assetsQuantity = assetsQuantity;
    }


    // getter & setter
    public String getAssetsName() {
        return assetsName;
    }

    public void setAssetsName(String assetsName) {
        this.assetsName = assetsName;
    }

    public String getAssetsId() {
        return assetsId;
    }

    public void setAssetsId(String assetsId) {
        this.assetsId = assetsId;
    }

    public String getAssetsType() {
        return assetsType;
    }

    public void setAssetsType(String assetsType) {
        this.assetsType = assetsType;
    }

    public double getAssetsPrice() {
        return assetsPrice;
    }

    public void setAssetsPrice(double assetsPrice) {
        this.assetsPrice = assetsPrice;
    }

    public double getAssetsDiscount() {
        return assetsDiscount;
    }

    public void setAssetsDiscount(double assetsDiscount) {
        this.assetsDiscount = assetsDiscount;
    }

    public int getAssetsQuantity() {
        return assetsQuantity;
    }

    public void setAssetsQuantity(int assetsQuantity) {
        this.assetsQuantity = assetsQuantity;
    }

    @Override
    public String toString() {
        return "Asset [Name=" + assetsName + ", ID=" + assetsId + ", Type=" + assetsType +
                ", Price=" + assetsPrice + ", Discount=" + assetsDiscount + "%, Quantity=" + assetsQuantity + "]";
    }
}

interface AssetsFunc {
    void addNewAsset();

    void displayAllAssets();

    void editAsset(String id);

    void deleteAsset(String id);

    Asset getAssetById(String id);
}

class AssetsFuncImpl implements AssetsFunc {
    private Asset[] assets = new Asset[10];
    private int index = 0;

    @Override
    public void addNewAsset() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter asset name:");
        String name = scanner.nextLine();

        System.out.println("Enter asset ID:");
        String id = scanner.nextLine();

        System.out.println("Enter asset type:");
        String type = scanner.nextLine();

        System.out.println("Enter asset price:");
        double price = scanner.nextDouble();

        System.out.println("Enter asset discount percentage:");
        double discount = scanner.nextDouble();

        System.out.println("Enter asset quantity:");
        int quantity = scanner.nextInt();
        scanner.nextLine(); // Consume the newline character
        scanner.close();
        Asset asset = new Asset(name, id, type, price, discount, quantity);
        if (index < assets.length) {
            assets[index] = asset;
            index++;
        } else {
            System.out.println("Asset storage is full.");
        }
    }

    @Override
    public void displayAllAssets() {
        if (index == 0) {
            System.out.println("No assets available.");
        } else {
            for (int i = 0; i < index; i++) {
                System.out.println(assets[i]);
            }
        }
    }

    @Override
    public void editAsset(String id) {
        for (int i = 0; i < index; i++) {
            if (assets[i].getAssetsId().equals(id)) {
                Scanner scanner = new Scanner(System.in);

                System.out.println("Enter new asset name:");
                assets[i].setAssetsName(scanner.nextLine());

                System.out.println("Enter new asset type:");
                assets[i].setAssetsType(scanner.nextLine());

                System.out.println("Enter new asset price:");
                assets[i].setAssetsPrice(scanner.nextDouble());

                System.out.println("Enter new asset discount percentage:");
                assets[i].setAssetsDiscount(scanner.nextDouble());

                System.out.println("Enter new asset quantity:");
                assets[i].setAssetsQuantity(scanner.nextInt());
                scanner.nextLine(); // Consume the newline character

                System.out.println("Asset updated successfully.");
                scanner.close();
                return;
            }
        }
        System.out.println("Asset with ID " + id + " not found.");
    }

    @Override
    public void deleteAsset(String id) {
        for (int i = 0; i < index; i++) {
            if (assets[i].getAssetsId().equals(id)) {
                for (int j = i; j < index - 1; j++) {
                    assets[j] = assets[j + 1];
                }
                assets[index - 1] = null;
                index--;
                System.out.println("Asset deleted successfully.");
                return;
            }
        }
        System.out.println("Asset with ID " + id + " not found.");
    }

    @Override
    public Asset getAssetById(String id) {
        for (int i = 0; i < index; i++) {
            if (assets[i].getAssetsId().equals(id)) {
                return assets[i];
            }
        }
        return null;
    }
}

public class App3 {
    public static void main(String[] args) {
        AssetsFuncImpl assetsFunc = new AssetsFuncImpl();
        Scanner scanner = new Scanner(System.in);
        int choice;

        do {
            System.out.println("1. Add new asset\n" +
                    "2. Edit asset\n" +
                    "3. View all assets\n" +
                    "4. View asset by ID\n" +
                    "5. Delete asset\n" +
                    "6. Exit");

            choice = scanner.nextInt();
            scanner.nextLine(); // Consume newline

            switch (choice) {
                case 1:
                    assetsFunc.addNewAsset();
                    break;
                case 2:
                    System.out.println("Enter asset ID to edit:");
                    String editId = scanner.nextLine();
                    assetsFunc.editAsset(editId);
                    break;
                case 3:
                    assetsFunc.displayAllAssets();
                    break;
                case 4:
                    System.out.println("Enter asset ID to view:");
                    String viewId = scanner.nextLine();
                    Asset asset = assetsFunc.getAssetById(viewId);
                    if (asset != null) {
                        System.out.println(asset);
                    } else {
                        System.out.println("Asset with ID " + viewId + " not found.");
                    }
                    break;
                case 5:
                    System.out.println("Enter asset ID to delete:");
                    String deleteId = scanner.nextLine();
                    assetsFunc.deleteAsset(deleteId);
                    break;
                case 6:
                    System.out.println("Thank you.");
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
                    break;
            }
        } while (choice != 6);

        scanner.close();
    }
}