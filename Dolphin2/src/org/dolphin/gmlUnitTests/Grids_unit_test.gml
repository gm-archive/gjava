/*
 * This is the grid test script used to unit test the grid functions in Dolphin
*/
state=4;
mygrid=ds_grid_create(10,20);
if (state == 0) ds_grid_destroy(mygrid)
if (state == 1) {
ds_grid_resize(mygrid,20,30)
show_message("Width =:"+string(ds_grid_width(mygrid))+" Should be 20");
show_message("Height =:"+string(ds_grid_height(mygrid))+" Should be 30");
}
if (state == 2) {
ds_grid_clear(mygrid,-6);
show_message("ds_grid_clear:"+string(ds_grid_get(mygrid,5,10))+". Should be -6");
}
else if (state == 3) {
ds_grid_set(mygrid,1,1,110);
show_message("ds_grid_set:"+string(ds_grid_get(mygrid,1,1))+". Should be 110");
ds_grid_add(mygrid,1,1,10);
show_message("ds_grid_add:"+string(ds_grid_get(mygrid,1,1))+". Should NOW be 120");
ds_grid_multiply(mygrid,1,1,10)
show_message("ds_grid_multiply:"+string(ds_grid_get(mygrid,1,1))+". Should NOW be 1200");
}
else if (state == 4) {
ds_grid_set_region(mygrid,0,0,5,5,-77)
show_message("ds_grid_set_region:"+string(ds_grid_get(mygrid,0,4))+". Should be -77");
show_message("ds_grid_set_region:"+string(ds_grid_get(mygrid,6,6))+". Should be 0");

ds_grid_add_region(mygrid,0,0,5,5,1)
show_message("ds_grid_add_region:"+string(ds_grid_get(mygrid,0,4))+". Should be -76");
show_message("ds_grid_set_region:"+string(ds_grid_get(mygrid,6,6))+". Should be 0");

ds_grid_multiply_region(mygrid,0,0,5,5,1)
show_message("ds_grid_add_region:"+string(ds_grid_get(mygrid,0,4))+". Should be -76");
show_message("ds_grid_set_region:"+string(ds_grid_get(mygrid,6,6))+". Should be 0");

}