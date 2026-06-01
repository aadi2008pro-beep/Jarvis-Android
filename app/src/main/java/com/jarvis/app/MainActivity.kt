package com.jarvis.app

import android.app.Activity
import android.content.Intent
import android.os.Bundle
import android.provider.Settings
import android.widget.Button
import android.widget.LinearLayout

class MainActivity : Activity() {
	    override fun onCreate(savedInstanceState: Bundle?) {
	    	        super.onCreate(savedInstanceState)

	    	                        val layout = LinearLayout(this)
	    	                                val button = Button(this)
	    	                                        button.text = "Activate God Mode"

	    	                                                        button.setOnClickListener {
	    	                                                        	            // Take the user to Accessibility settings to turn on Jarvis
	    	                                                        	                        val intent = Intent(Settings.ACTION_ACCESSIBILITY_SETTINGS)
	    	                                                        	                                    startActivity(intent)
	    	                                                        	                                            }

	    	                                                        	                                                            layout.addView(button)
	    	                                                        	                                                                    setContentView(layout)
	    	                                                        	                                                                        }
	    	                                                        	                                                                        }
	    	                                                        	                                                                        
	    	                                                        }
	    }
}
