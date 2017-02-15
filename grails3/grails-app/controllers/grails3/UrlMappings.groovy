package grails3

class UrlMappings {

    static mappings = {
        "/$controller/$action?/$id?(.$format)?"{
            constraints {
                // apply constraints here
            }
        }

        "/"(view:"/index")
        "500"(view:'/error')
        "404"(view:'/notFound')



       /* "/"(controller:"index", action: "index")
//      "/testXXX/newList"(controller:"index", action: "newList")
        "/page/$name"(controller:"siteBlock", action: "index")

        "/$name" (controller: "view", action: "index")

        "/$name/11111$num"(controller: "testXXX", action: "testXXX"){vol=0} //for video
        "/$name/1111122$vol/$num"(controller: "testXXX", action: "testXXX")
        "/reader/$name/vol$vol/$num"(controller: "testXXX", action: "reader")
        "/$name/testXXX/$id"(controller: 'testXXX', action: 'testXXX')
        "/$name/shop/" (controller:"view", action: "shop")

        "/testXXX/videoCode/$id" (controller: "testXXX", action: 'videoCode')
        "/testXXX/shopOne/$id" (controller: "view", action: 'shopOne')

        "/testXXX/editor/$action/$id?" (controller: "editor")
        "/testXXX/testXXX1/$action/$id?" (controller: "testXXX1")
        "/testXXX/testXXX2/$action/$id?" (controller: "editorPerson")
        "/testXXX/testXXX3/$action/$id?" (controller: "editorBook")
        "/testXXX/edit/$action?/$id?" (controller: "editorManga")
        "/testXXX/group/$action?/$id?" (controller: "group")
        "/testXXX/random" (controller: "view", action: "random")
        "/testXXX/modal/$action?" (controller: 'modal')
        "/testXXX/$id" (controller: "testXXX", action:'show')
        "/testXXX/show_$linkName" (controller: "testXXX", action:'index')
        "/testXXX/alltestXXX" (controller: "testXXX", action:"list")
        "/testXXX/calendar" (controller: "calendar", action: 'index')
        "/testXXX/calendar/$action/$id?" (controller: "calendar")
        "/testXXX/testXXX/$action/$id?" (controller: "testXXX")

        "/testXXX/testXXX5/$type/$id" (controller: "testXXX9", action:"forumTopic")
        "/user/$action/$id?" (controller:"user")


        "/$name/testXXXs/" (controller:"testXXX", action: "testXXX")

        "/testXXX/$id" (controller:"testXXX", action: "index")
        "/testXXX/list" (controller:"testXXX", action: "list")
        "/testXXX/user/$id" (controller:"testXXX", action: "user")
        "/testXXX/competition/$id" (controller:"testXXX", action: "competition")
        "/testXXX/testXXX/$action/$id?" (controller:"testXXX")

        "/about/" (controller: "index", action: "about")
        "/testXXX/ajax/$action" (controller: "remoteJS")
        "/search" (controller: "search", action: "advanced")
        "/search/$action" (controller: "search")

        "/testXXX/testXXX6/$action" (controller: "testXXX6")

        "/list/like/$id"(controller: "similar", action: "index")
        "/list/presentation"(controller: "testXXX", action: "presentation")
        "/testXXX/like/$action/$id"(controller: "similar")

        "/list/votes/$type/$linkName/"(controller: "testXXX", action: "ratingVotes")

//      "/list/"(controller: "testXXX", action: "index")
        "/list/$lang?/"(controller: "testXXX", action: "index"){
            constraints {
                lang inList: ['us','ru','jp','en']
            }
        }

        "/list/statistics/$type/$id/"(controller: "testXXX", action: "statistics")

        "/list/testXXX/$id"(controller: "testXXX", action: "index")
        "/list/statistics/testXXX/$linkName/"(controller: "testXXX", action: "statistics")

        "/list/$type/$id"(controller: "testXXX", action: "index")

        "/list/${id}s/"(controller: "testXXX", action: "testXXX"){
            constraints {
                id notEqual: "u"  //for us lang
            }
        }
        "/list/${name}s/sort_$sortType"(controller: "testXXX", action: "testXXX")

        "/list/deserted/$type?"(controller: "testXXX", action: "deserted")

        "/testXXX7"(controller: "testXXX7", action: "list")
        "/testXXX7/$linkName"(controller: "testXXX7", action: "index")
        "/$linkName/testXXX7s"(controller: "testXXX7", action: "testXXX")
        "/testXXX/testXXX7/$action"(controller: "testXXX7")

        "/quote"(controller: "quote", action: "list")
        "/$linkName/quotes"(controller: 'quote', action: 'index')

        "/testXXX/quote/$action"(controller: "quote")

        "/rss/$action?"(controller: "rss")
        "/testXXX/testXXX8/$action/$id?" (controller: "testXXX8")
        "/testXXX/testXXX8/video/$action/$id?" (controller: "testXXX8Video")

        "/testXXX/error/$action"(controller:"error")
        "/testXXX/error/unauthorized"(controller:"testXXX9", action:"unauthorized")
        "/testXXX/auth"(controller:"testXXX9", action:"login")
        "/testXXX/auth/restore"(controller:"testXXX9", action:"restore")
        "/testXXX/test/authenticateInfo"(controller:"testXXX9", action:"authenticateInfo")
        "/sitemap.xml"(controller:"sitemap", action:"sitemapAction")
        "/sitemap_index.xml"(controller:"sitemap", action: 'index')
        "/sitemap_${action}_${id}.xml"(controller:"sitemap")
        "/testXXX/redirect"(controller:"index", action:"redirect")


        "/testXXX/moder/main/$action?" (controller:"XXXXX")
        "/testXXX/moder/permission/$action?" (controller:"XXXX")
        "/testXXX/moder/edit/$action?" (controller:"editXXX")
        "/testXXX/moder/view/$action?" (controller:"siteXXX")
        "/testXXX/property/$action?" (controller:"property")

        "/testXXX/test/error" (controller:"error", action: "test500")


        // testYYYY

        "/testYYYY/hibernateStats/$action?"(controller:"hibernateStats")
        "/testYYYY/config/$action?" (controller:"configuration")
        "/testYYYY/info/$action?" (controller:"buildInfo")
        "/testYYYY/types/$action?/$id?" (controller:"types")
        "/testYYYY/search/$action?" (controller:"testYYYYSearch")


        "/testYYYY/users/$action?" (controller:"users")
        "/testYYYY/messages/$action?/$id?" (controller:"messages")
        "/testYYYY/testYYYY/$action?/$id?" (controller:"testYYYY")

//      "/testYYYY/testYYYYSearch/$action?/$id?" (controller: 'testYYYYSearch')


        "/testYYYY/testYYYY/$action?/$id?" (controller:"testYYYY")
        "/testYYYY/testXXX0/$action?" (controller: "testXXX0")*/

    }
}
