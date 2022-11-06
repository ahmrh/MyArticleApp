package com.dicoding.myarticleapp

object ArticlesData {
    private val ids = intArrayOf(
        1, 2, 3, 4, 5, 6, 7, 8, 9, 10
    )
    private val titles = arrayOf(
        "Cloudy Evening",
        "Apollo Landing",
        "Apollo Rocket",
        "The Conquest",
        "Into the Unknown",
        "The Struggle",
        "The Watcher",
        "Launching",
        "Armed Cloud",
        "The Holiday"
    )

    private val overviews = arrayOf(
        "It was a cloudy afternoon and it was getting dark slowly. It was almost 7 pm. I was on the balcony drinking coffee and watching the sunset. ",
        "Yesterday afternoon, at 5:39pm, the longest and most ambitious space project in history has ended in success.",
        "Apollo Rocket has just launched on July 16th and it will be orbiting around the moon for the next two years.",
        "Apollo rover has explored the moon, there are no trace of living beings but human could live here.",
        "It is still unexplored territory. There are more planet out there in space, where maybe there are much more living beings than us with advanced technology.",
        "The search for habitable planets orbiting other stars has been going on for decades.",
        "The Earth is the only place where we can live as a human being. But it might not be long before we have to say goodbye to it.",
        "So we've all been wondering, what are the chances of finding a place to live in space? Well, now we know: pretty slim.",
        "A fragile shield of gas, lies in the lower portion of the stratosphere, protecting the Earth from the Sun’s harmful UV radiation, making life possible here.",
        "Scientists are very advanced people, always learning and investigating. They need to be able to relax and have fun too."
    )

    private val texts1 = arrayOf(
        "The sky had turned purple with some clouds in the distance. The sun was setting and casting a bright orange glow over everything. Everything around me seemed to be getting darker as if there was a dimming of energy in the air itself. I thought about how beautiful it would be if God's light could somehow make even just one person feel at peace instead of being so full of fear and anxiety - like we all live in this world where we're always worried about what might happen next.\"",

        "The Apollo 17 mission was launched into deep space when a Saturn V rocket took off from Kennedy Space Center in Cape Canaveral, Florida at 2:33pm EST. The Apollo rover has landed safely on the moon and is preparing to begin exploring the moon's surface.\" This will be the first time humans have set foot on another planet, and it's sure to be an amazing experience. While we wait for the rover to get into action and begin exploring, let's take a look at what we know about this new frontier so far.\"",

        "This mission will help us learn more about our planet's gravity, its interior structure and maybe even find evidence of water on the moon! We know that there are other planets out there in space and we have no idea what's waiting for us if we go really far away from Earth. But this mission is going to give us a good chance to know more about our universe.",

        "The moon is a place for human to explore and build a base. The moon has many craters which are perfect for building the base. The moon has lots of resources such as water, fuel and food. These resources make it possible for us to live on the moon.",

        "Scientists believe that every point in space has its own planet, but none of them have been found yet because they are too far away from us. We don't know how many planets exist out there or what kind of life forms live on them.",

        "In recent years, scientists have focused their attention on the atmospheres of these exoplanets, hoping to find signs of oxygen or methane in their atmospheres. Unfortunately, this has not been successful. ",

        " We are already observing how our planet is dying due to climate change and pollution. In 2011, NASA reported that the last time we saw an ice sheet bigger than Antarctica was more than 12,000 years ago!",

        "We've launched many space shuttles over the years in an attempt to find some planet where humans can thrive—but so far it hasn't worked out for us. The rich people who funded these missions have gotten very rich by supporting this idea, but it's not looking like we'll ever find a planet that will let us settle down.",

        "After the ozone hole discovery, heavy investment in scientific research, marshalling of economic resources and coordinated international political action helped to turn things around.",
        " One possible holiday for astronauts on Mars could be a \"Halloween in Space\" celebration. This could involve dressing up in space-themed costumes, decorating the spacecraft or habitat with spooky or festive decorations, and eating space-themed Halloween candy. Other activities could include watching scary movies or telling ghost stories. "
    )


    private val texts2 = arrayOf(
        "I looked around at my surroundings and saw that everyone seemed to be lost in their own thoughts or staring off into space, not really noticing what was going on around them. I wondered if any of them felt at peace or if they were still so full of fear and anxiety that they couldn't see any beauty in the world around them.",

        "There are many significant events in history. It's important to reflect upon them. This is just one of them. The mission will end on December 14th, 1972, when astronauts Eugene Cernan and Ronald Evans return to Earth with the lunar module Falcon.",

        "The goal of this mission is not only to explore space but also to bring science closer to people who are interested in science but don't have enough time or resources available to pursue their interest in science through research activities themselves.",

        "We can also use these resources to grow plants and animals which will help us survive here. We need not worry about food because we can eat anything that grows on the moon or in space. We can also use rocket fuel to get from one place to another on the moon or in space without any problem at all.",

        "Scientists believe that every point in space has its own planet, but none of them have been found yet because they are too far away from us. We don't know how many planets exist out there or what kind of life forms live on them.",

        "The reason that scientists are having trouble finding habitable planets is because they don't want to take too long looking for them. Looking at a star and seeing if there's an exoplanet around it would take a really long time—maybe even longer than it would take to actually go back in time and see if there were any planets around those stars before they were born!",

        "The food chain would continue to function, but we wouldn't be able to see the animals that are no longer on our planet. We would lose all of our senses, except for smell and taste—and even those could be affected by the change in atmosphere from CO2 poisoning.",

        "So while you're still getting to see all the cool stuff they've found up there (like that thing with the giant wormhole), don't worry: there's no need to pack your bags just yet.",
        "Today, the ozone hole still exists, forming every year over Antarctica in the spring. It closes up again over the summer as stratospheric air from lower latitudes is mixed in, patching it up until the following spring when the cycle begins again. But there’s evidence it’s starting to disappear – and recover more or less as expected, says Solomon. Based on scientific assessments, the ozone layer is expected to return to pre-1980 levels around the middle of the century. Healing is slow because of the long lifespan of ozone-depleting molecules. Some persist in the atmosphere for 50 to 150 years before decaying.",
        "In halloween is a special event that happens every year on October 31st. It is a time when astronauts dress up in costumes and float around in zero gravity, handing out candy to everyone they meet!"
    )

    private val images = intArrayOf(
        R.drawable.article1,
        R.drawable.article2,
        R.drawable.article3,
        R.drawable.article4,
        R.drawable.article5,
        R.drawable.article6,
        R.drawable.article7,
        R.drawable.article8,
        R.drawable.article9,
        R.drawable.article10
    )


    val listData: ArrayList<Article>
        get() {
            val list = arrayListOf<Article>()
            for (position in titles.indices) {
                val article = Article()
                article.id = ids[position]
                article.title = titles[position]
                article.overview = overviews[position]
                article.image = images[position]

                article.text1 = texts1[position]
                article.text2 = texts2[position]
                list.add(article)
            }
            return list
        }
}