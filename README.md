# Introduction
This Recipe installs AWSIoTPythonSDK 1.4.7 (which is the latest version) and its dependency, pyOpenSSL (19.1.0). Note that there are some other dependencies of AWSIoTPythonSDK but their recipes already exist and are part of OpenEmbedded.

## Utilization

Clone repository to your layers directory.

```sh

git clone https://github.com/engrhamzaaliimran/meta-aws-iot.git

```

Add the layer to your bblayers.conf

```
BBLAYERS += "/path/to/meta-aws-iot"
```

Add recipes to your local.conf
```
IMAGE_INSTALL_append += " aws-credentials"
IMAGE_INSTALL_append += " python-awsiotpythonsdk python-json python-pyopenssl python-logging"
```
To connect with your AWS IoT backend, you’ll need the provisioning credentials . Download them form AWS account. Create a folder named "client-credentials" in your build directory and copy your AWS credentials in it. Credentials include following files 

```
│   cert.pem
│   private.key
│   public.key
│   root-CA.crt
```
In the image, these credentials will be copied to "/etc/aws-credentials/client-credentials" path. 
To add your application source code to image. Create a folder named "src" inside the build directory and copy your code there. In image, your source will be copied to "/etc/src". 

Then build your image using `bitbake`
