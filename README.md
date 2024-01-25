
Lock Screen Library for Jetpack Compose

![Screenshot_1706186506](https://github.com/majid2851/LockScreen/assets/46685643/58452a96-23fb-4828-8ca4-dff7710521fb) 
![232484028-c45a98a0-b1a6-4657-8b92-8ac9c7b96436](https://github.com/majid2851/LockScreen/assets/46685643/2f7d90d6-3e26-49ec-9680-2b10cf4abdc7)






	 PasswordPattern(
		onStart = {
		    //Do what you want before start     
		}, 
		onResult ={
		    //you can store password here      
		} ,
		boxSize = 200.dp,
		sensitivity = 80f,
		dotsDefaultColor = Color.Black,
		dotsSecondColor = Color.DarkGray,
		lineColor =Color.Gray ,
		dotSize = 69f,
		lineStroke = 10f,
		animationDuration =200 ,
		animationDelay = 100,
		smallDotSize = 42f,
	    )




To use this library you should implement these settings



	dependencyResolutionManagement
	{
		repositoriesMode.set(RepositoriesMode.FAIL_ON_PROJECT_REPOS)
		repositories {
			mavenCentral()
			maven { url 'https://jitpack.io' }
		}
	}
 

add this to dependecy


	dependencies 
	{
		implementation 'com.github.majid2851:LockScreen:Tag'
	}
 


