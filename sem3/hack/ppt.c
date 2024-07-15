#include <windows.h>
#include <urlmon.h>
#pragma comment(lib, "urlmon.lib")

int main() {
    // URL of the image
    const char* url = "https://s3.ap-southeast-1.amazonaws.com/parul-private-cloud-media/1719035851708-0.jpg"; // Replace with the URL of your image
    // Path to save the image
    const char* filePath = "downloaded_image.jpg";

    HRESULT hr = URLDownloadToFile(NULL, url, filePath, 0, NULL);
    if (SUCCEEDED(hr)) {
        printf("Download successful!\n");
    } else {
        printf("Download failed with error");
    }

    return 0;
}
