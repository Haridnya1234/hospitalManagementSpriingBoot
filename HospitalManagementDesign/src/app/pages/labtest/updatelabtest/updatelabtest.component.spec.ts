import { ComponentFixture, TestBed } from '@angular/core/testing';

import { UpdatelabtestComponent } from './updatelabtest.component';

describe('UpdatelabtestComponent', () => {
  let component: UpdatelabtestComponent;
  let fixture: ComponentFixture<UpdatelabtestComponent>;

  beforeEach(() => {
    TestBed.configureTestingModule({
      declarations: [UpdatelabtestComponent]
    });
    fixture = TestBed.createComponent(UpdatelabtestComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
