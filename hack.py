import requests
import shutil

str1=input("enter the url without (.jpg) and pg no.")
str2=".jpg"
loc=input("enter loc. end with '\\' : ")

i=45
while(i<60):

    # URL of the image
    url = str1+str(i)+str2 # Replace with the URL of your image

    # Path to save the image
    output_path = loc+"img-"+str(i)+".jpg"

    # Send a GET request to the URL
    response = requests.get(url, stream=True)

    # Check if the request was successful
    if response.status_code == 200:
        # Open a file in binary write mode
        with open(output_path, 'wb') as out_file:
            # Copy the content of the response (image data) to the file
            shutil.copyfileobj(response.raw, out_file)
        print("Download successful!")
    else:
        print(f"Download failed with status code {response.status_code}")

    # Close the response to release the connection
    response.close()
    i=i+1


