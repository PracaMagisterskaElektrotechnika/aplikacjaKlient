package pl.kobak.rafal.dicommobile;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;

public class OpenFile extends Activity
{
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_open_file);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu p_menu)
    {
        getMenuInflater().inflate(R.menu.menu_open_file, p_menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item)
    {
        int id = item.getItemId();

        if (id == R.id.action_settings)
        {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    public void onClick_openFileLocally(View p_view)
    {
        Intent l_openFileLocally = new Intent(this, OpenFileLocally.class);
        startActivity(l_openFileLocally);
    }

    public void onClick_openFileRemotely(View p_view)
    {
        Intent l_openFileRemotely = new Intent(this, OpenFileRemotely.class);
        startActivity(l_openFileRemotely);
    }

    public void onClick_history(View p_view)
    {
        Intent l_history = new Intent(this, History.class);
        startActivity(l_history);
    }
}
