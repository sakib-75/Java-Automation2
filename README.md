# Automation with selenium java

#### Driver workflow

BaseDriver `-->` TestHome `-->` HomePage `-->` BasePage

### Allure report setup steps for local machine

1. Open browser
2. Download allure for windows :
   - Link: https://repo.maven.apache.org/maven2/io/qameta/allure/allure-commandline/
   - Select any version
   - Download allure-commandline-(version).zip
3. Downloaded file name: allure-commandline-(version).zip
4. After extracting put this folder in c drive or any other drive
5. Copy path till bin folder
   such as : C:\allure-(version)\bin
6. Set this path in the system variable
7. Check the version using cmd
   = allure --version


### Allure report setup steps for automation project

1. Add `allure-testng` dependency into `<dependencies> </dependencies>` </br>
   Collect dependency from here 👉 https://mvnrepository.com/artifact/io.qameta.allure/allure-testng


2. Add this to `pom.xml`

```xml
 <build>
     <plugins>
         <plugin>
             <groupId>org.apache.maven.plugins</groupId>
             <artifactId>maven-surefire-plugin</artifactId>
             <version>${maven-surefire-plugin-version}</version>
             <configuration>
                 <argLine>
                     -javaagent:"${settings.localRepository}/org/aspectj/aspectjweaver/${aspectj.version}/aspectjweaver-${aspectj.version}.jar"
                 </argLine>
             </configuration>
             <dependencies>
                 <dependency>
                     <groupId>org.aspectj</groupId>
                     <artifactId>aspectjweaver</artifactId>
                     <version>${aspectj.version}</version>
                 </dependency>
             </dependencies>
         </plugin>
     </plugins>
 </build>
```

3. Add this to `pom.xml`
```xml
<properties>
   <aspectj.version>1.9.7</aspectj.version>
   <maven-surefire-plugin-version>3.0.0-M5</maven-surefire-plugin-version>
</properties>
```

