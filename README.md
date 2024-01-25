
Lock Screen Library for Jetpack Compose

![Uploading Screenshot_1706186506.png…]()



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
 




	dependencies 
	{
		implementation 'com.github.majid2851:LockScreen:Tag'
	}
 


