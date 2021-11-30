# radarmod

tutorial/showcase: https://www.youtube.com/watch?v=XXXXXXXXX // change later

> commands
```
/radar
```

theoretically i should not be calling `new ScaledResolution(mc)` every RenderTickEvent (in the Listener class) but there was virtually no difference in performance when i registered a separate event (ClientTickEvent) and had a global scale variable. i guess the difference is negligible since less ScaledResolution calls = good BUT more event listeners = bad.
