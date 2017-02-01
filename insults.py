#!/usr/bin/python
import cgi
import random

form = cgi.FieldStorage()

list1 = ["arless","bawdy","beslubbering","bootless","churlish","cockered","clouted","craven","currish","dankish","dissembling","droning","errant","fawning","fobbing","froward","frothy","gleeking","foatish","gorbellied","impertinent","infectious","jarring","loggerheaded","lumpish","mammering","mangled","mewling","paunchy","pribbling","puking","puny","qualling","rank","reeky","roguish","ruttish","saucy","spleeny","spongy","surly","tottering","unmuzzled","vain","venomed","villainous","warped","wayward","weedy","yeasty"]

list2 = ["base-court","bat-fowling","beef-witted","beetle-handed","boil-brained","clapper-clawed","clay-brained","common-kissing","crook-pated","dismal-dreaming","dizzy-eyed","doghearted","dread-bloated","earth-vexing","elf-skinned","fat-kidneyed","fen-sucked","flap-mouthed","fly-bitten","folly-fallen","fool-born","fool-gorged","guts-gripping","half-faced","hasty-witted","hedge-born","hell-hated","idly-hated","ill-greeding","ill-nurtured","knotty-pated","milk-livered","motley-minded","onion-eyed","plume-plucked","pottle-deep","pox-marked","reeling-ripe","rough-hewn","rude-growing","rump-fed","shard-born","sheep-biting","spur-galled","swag-bellied","tardy-gaited","tickle-brained","toad-spotted","unchin-snouted","weather-bitten"]

list3 = ["apple-john","baggage","barnacle","bladder","boar-pig","bugbear","bum-bailey","canker-blossom","clack-dish","clotple","coxcomb","codpiece","deaf-token","dewberry","flap-dragon","flax-wench","flirt-gill","foot-licker","fustilarain","giglet","gudgeon","haggard","harpy","hedge-pig","horn-beast","hugger-mugger","jointhead","lewdster","lout","maggot-pie","malt-worm","mammet","measel","minnow","miscreant","moldwrap","mubble-news","nut-hook","pigeon-egg","pignut","puttock","pumpion","ratsbane","scut","skainsmate","strumpet","varlot","vasssal","whey-face","wagtail"]

print "Content-Type: text/html"
print """
<html>
<link href="https://fonts.googleapis.com/css?family=Bad+Script" rel="stylesheet">
<style>
p {
	text-align: center;
	font-family: 'Bad Script', cursive;
}
a {
	text-align: center;
	color: blue;
	text-decoration: none;
	width: 100%;
}
.first {
	font-size: 4vw;
}
.second {
	font-size: 5vw;
}
.third {
	font-size: 6vw;
}
.header {
	font-weight: bold;
}
</style>
<link href="https://fonts.googleapis.com/icon?family=Material+Icons" rel="stylesheet">
<body>
<p class="first header">Shakespearian Insult Generator</p>
"""
print """
<table style="float:center"><tr>
<td style="width:30vw"></td>
<td>
<p class="first">
"""
print(list1[random.randint(0,49)])
print """
</p>
<p class="second">
"""
print(list2[random.randint(0,49)])
print """
</p>
<p class="third">
"""
print(list3[random.randint(0,49)])
print """
</p>
<p>
<a href="http://technicalviking.com/cgi-bin/insults.py?"><i class="material-icons">autorenew</i> Again <i class="material-icons">autorenew</i></a>
</p>
<p>
<a href="http://github.com/stevenfarabaugh/shakespeare_insults"><i class="material-icons">code</i>Code on github<i class="material-icons">code</i></a>
</p>
</td>
<td style="vertical-align:top;">
<img src="http://technicalviking.com/herald.png" style="height:60vh;">
</td>
</tr>
</table>
"""
print """
</body>
</html>
"""