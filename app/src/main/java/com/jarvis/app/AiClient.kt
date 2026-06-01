package com.jarvis.app

import okhttp3.*
import java.io.IOException

class AiClient {
	    private val client = OkHttpClient()

	        fun askAi(query: String) {
	        	        val request = Request.Builder()
	        	                    .url("YOUR_API_URL") // Replace with your AI server endpoint
	        	                                .build()

	        	                                        client.newCall(request).enqueue(object : Callback {
	        	                                        	            override fun onFailure(call: Call, e: IOException) {
	        	                                        	            	                e.printStackTrace()
	        	                                        	            	                            }
	        	                                        	            	                                        override fun onResponse(call: Call, response: Response) {
	        	                                        	            	                                        	                // Handle the AI response here
	        	                                        	            	                                        	                            }
	        	                                        	            	                                        	                                    })
	        	                                        	            	                                        	                                        }
	        	                                        	            	                                        	                                        }
	        	                                        	            	                                        	                                        
	        	                                        	            	                                        }
	        	                                        	            }
	        	                                        })
	        }
}
