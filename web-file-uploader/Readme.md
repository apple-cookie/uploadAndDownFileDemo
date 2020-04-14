## 文件上传下载示例

## 一步一步来

**1. Clone 代码** 

```bash
git clone git@gitee.com:tigerxue/web-file-uploader.git
```

**2. 设置上传目录**

打开 `src/main/resources/application.yml` 改变 `file.upload-dir` 为你设置的值.

```
file.upload-dir=uploads
```

**3. maven运行**

```bash
cd web-file-uploader
mvn spring-boot:run
```

打开链接: `http://localhost:8080`.

```bash
mvn clean package
java -jar target/file-upload-0.0.1-SNAPSHOT.jar
```
**4. 演示图**
	<table>
    <tr>
        <td><img src="http://tigerxue.gitee.io/liinux-images/docs/fileupload/file-upload.gif"/></td>
    </tr>
	</table>
**5. 联系作者**

- [oschina](http://git.oschina.net/liinux)
- [cnblogs](http://www.cnblogs.com/liinux)
- [github](https://github.com/liinnux)

**6. 扫码关注**
<table>
    <tr>
		<td>作者微信</td>
        <td><img src="http://tigerxue.gitee.io/liinux-images/docs/img/alukesi.jpg" /></td>
        <td>公众号</td>
        <td><img src="http://tigerxue.gitee.io/liinux-images/docs/img/ghosy-login-微信公众号.jpg" /></td>
        <td>企鹅群</td>
        <td><img src="http://tigerxue.gitee.io/liinux-images/docs/img/ghosy-login-QQ群.jpg" /></td>
    </tr>
</table>